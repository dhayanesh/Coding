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
    public int countNodes(TreeNode root) {
                if (root == null) return 0;
        
        int count = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {        
                TreeNode current = queue.poll();
                count++;
                
                if (current.left != null) 
                    queue.offer(current.left);
                if (current.right != null) 
                    queue.offer(current.right);
            }
        }
        return count;
    }
}
