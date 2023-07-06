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
    public TreeNode searchBST(TreeNode root, int val) {
        return helper(root, val);
    }

    public TreeNode helper(TreeNode root, int val) {
        if(root == null)
            return null;
        
        if(root.val == val)
            return root;
        
        TreeNode res = new TreeNode();
        if(root.val > val)
            res = helper(root.left, val);
        else
            res = helper(root.right, val);
        
        return res;
    }
}
