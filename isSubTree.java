/* Definition for a binary tree node.
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String s1 = ",";
        String s2 = ",";
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode currNode = stack.peek();
            stack.pop();
            if (currNode != null) {
                stack.add(currNode.right);
                String temp = String.valueOf(currNode.val);
                s1 = s1.concat(temp).concat(",");                
                stack.add(currNode.left);
            }
            else
                s1 = s1.concat("$,");            
        }

        Stack<TreeNode> subStack = new Stack<>();
        subStack.add(subRoot);
        while (!subStack.isEmpty()) {
            TreeNode currNode = subStack.peek();
            subStack.pop();
            if (currNode != null) {
                subStack.add(currNode.right);
                String temp = String.valueOf(currNode.val);
                s2 = s2.concat(temp).concat(",");  
                subStack.add(currNode.left);
            }
            else
                s2 = s2.concat("$,");

        }

        System.out.println(s1);
        System.out.println(s2);
        if(s1.contains(s2))
            return true;
        else
            return false;

    }
}
