/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    // Main function to delete a node with a given key from the BST
    public TreeNode deleteNode(TreeNode root, int key) {
        // Base case: if the tree is empty, return null
        if (root == null) return null;

        // If the key is smaller than the current node's value, go to the left subtree
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } 
        // If the key is greater than the current node's value, go to the right subtree
        else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } 
        // Node to delete is found (root.val == key)
        else {
            // Case 1: Node has no left child — just return its right child
            if (root.left == null) return root.right;

            // Case 2: Node has no right child — just return its left child
            if (root.right == null) return root.left;

            // Case 3: Node has two children
            // Find the inorder successor (minimum node in the right subtree)
            TreeNode min = findmin(root.right);

            // Replace the current node's value with the successor's value
            root.val = min.val;

            // Recursively delete the inorder successor from the right subtree
            root.right = deleteNode(root.right, min.val);
        }

        // Return the updated root of the tree
        return root;
    }

    // Helper function to find the minimum value node in a subtree
    private TreeNode findmin(TreeNode node) {
        // The leftmost node is the minimum in a BST
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
