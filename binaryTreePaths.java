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
    List<String>  result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String s = "";
        searchPath(root, s);
        return result;
    }
    public void searchPath(TreeNode root, String s) {
        if(root != null) {
            if(root.left == null && root.right == null)
                result.add(s+root.val);
        searchPath(root.left, s+root.val+"->");
        searchPath(root.right, s+root.val+"->");
        }
    }
}
