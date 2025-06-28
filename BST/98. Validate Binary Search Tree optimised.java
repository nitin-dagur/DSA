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

    // Main method to check if the tree is a valid BST
    public boolean isValidBST(TreeNode root) {
        // Start with the full range of valid values for a BST
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    /**
     * Recursive helper method to validate the BST.
     * @param root - current node
     * @param min - minimum allowed value for current subtree (exclusive)
     * @param max - maximum allowed value for current subtree (exclusive)
     * @return true if the subtree rooted at 'root' is a valid BST
     */
    public boolean validate(TreeNode root, long min, long max) {
        // Base case: empty subtree is valid
        if (root == null) return true;

        // Check current node value:
        // It must be strictly greater than min and strictly less than max
        if (root.val <= min || root.val >= max) return false;

        // Recursively check the left and right subtrees:
        // Left subtree: max allowed value becomes root.val
        // Right subtree: min allowed value becomes root.val
        return validate(root.left, min, root.val) &&
               validate(root.right, root.val, max);
    }
}
