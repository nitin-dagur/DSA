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
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return Maxdiameter;
        
    }
    int Maxdiameter = 0;
    public int diameter(TreeNode root){
        if(root == null) return 0;

        int leftHeight = diameter(root.left);
        int rightHeight = diameter(root.right);
        Maxdiameter = Math.max(Maxdiameter,leftHeight + rightHeight);

        return 1 + Math.max(leftHeight,rightHeight);
    }
}
