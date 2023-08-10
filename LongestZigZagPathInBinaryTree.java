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
    int longestZigZag = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null)
            return 0;
        traverse(root.left, true, 1); 
        traverse(root.right, false, 1); 

        return longestZigZag;
    }
    
    private void traverse(TreeNode node, boolean isLeft, int length) {
        if (node == null)
            return;
        
        longestZigZag = Math.max(longestZigZag, length);
        
        if (isLeft) {
            traverse(node.right, false, length + 1); 
            traverse(node.left, true, 1); 
        } else {
            traverse(node.left, true, length + 1); 
            traverse(node.right, false, 1);
        }
    }
}
