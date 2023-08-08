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
    TreeNode curr = new TreeNode(0);

    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans;
        ans = curr;
        inorder(root);
        return ans.right;
    }

    public void inorder(TreeNode node) {
        if (node == null) 
            return;

        inorder(node.left);
        
        curr.right = new TreeNode(node.val);
        curr = curr.right;

        inorder(node.right);
    }

}
