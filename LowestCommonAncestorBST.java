/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node  = root;
        while(node != null) {
            if(node.val > p.val && node.val > q.val)
                node = node.left;
            else if(node.val < p.val && node.val < q.val)
                node = node.right;
            else 
                return node;
        }
        return null;
    }
}
