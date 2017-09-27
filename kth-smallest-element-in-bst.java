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
    int count=1;
    int res=0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return res;
    }
    
    public void dfs(TreeNode root,int k){
        if(root!=null){
            dfs(root.left,k);
            if(count++==k){
                res=root.val;
            }
            dfs(root.right,k);
        }
    }
}
