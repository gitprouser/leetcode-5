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
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return dfs(root.left,root.right);
    }
    public boolean dfs(TreeNode left,TreeNode right){
        if(left==right&&left==null){
            return true;
        }else if(left==null||right==null){
            return false;
        }
        boolean val = left.val==right.val;
        boolean l=dfs(left.right,right.left);
        boolean r=dfs(left.left,right.right);
        return val&&l&&r;
    }
}
