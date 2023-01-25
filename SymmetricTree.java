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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
            
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.right);
        stack.push(root.left);
        while(!stack.isEmpty()) {
            TreeNode lt = stack.pop();
            TreeNode rt = stack.pop();
            if(rt == null && lt == null)
                continue;
            if(rt == null || lt == null || rt.val != lt.val)
                return false;
            stack.push(lt.left);
            stack.push(rt.right);
            stack.push(lt.right);
            stack.push(rt.left);
        }
        return true;
    }
}
