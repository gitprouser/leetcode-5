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
    int res;
    public int maxPathSum(TreeNode root) {
        res = root.val;
        dfs(root);    
        return res;
    }
    
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int top = root.val+(left>0?left:0)+(right>0?right:0);
        res = Math.max(res,top);
        return Math.max(left,right)>0?Math.max(left,right)+root.val:root.val;
    }
}
