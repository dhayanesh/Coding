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
    public boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return flag;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) 
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(Math.abs(left - right) > 1)
            flag = false;
        return 1 + Math.max(left, right);
    }
}
