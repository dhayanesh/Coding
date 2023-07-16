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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
            
        calculateSum(root, 0);
        return sum;
    }

    void calculateSum(TreeNode root, int currSum) {        
        currSum = currSum * 10 + root.val;

        if(root.left == null && root.right == null)
            sum += currSum;
        
        if(root.left != null)
            calculateSum(root.left, currSum);
        if(root.right != null)
            calculateSum(root.right, currSum);
    }
}
