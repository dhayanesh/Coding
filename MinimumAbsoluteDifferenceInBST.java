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
    int min = Integer.MAX_VALUE;
    int prevVal = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        findMin(root);
        return min;
    }
    public void findMin(TreeNode root) {
        if(root == null)
            return;
        
        findMin(root.left);
        if(prevVal != Integer.MAX_VALUE)
            min = Math.min(min, root.val - prevVal);
        prevVal = root.val;
        findMin(root.right);
    }
}
