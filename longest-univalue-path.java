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
    int max;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null){
            return 0;
        }
        helper2(root,root.val);
        return max;
        // int sub = Math.max(longestUnivaluePath(root.left),longestUnivaluePath(root.right));
        // return Math.max(sub,helper(root.left,root.val)+helper(root.right,root.val));
    }
    public int helper(TreeNode root,int pre){
        if(root==null||root.val!=pre){
            return 0;
        }else{
            return 1+Math.max(helper(root.left,root.val),helper(root.right,root.val));
        }
    }
    
    public int helper2(TreeNode root,int pre){
        if(root==null){
            return 0;
        }else{
            int left = helper2(root.left,root.val);
            int right = helper2(root.right,root.val);
            if(root.left!=null){
                left = root.left.val==root.val?left+1:0;
            }
            if(root.right!=null){
                right = root.right.val==root.val?right+1:0;   
            }
            max = Math.max(max,left+right);
            return Math.max(left,right);
        }
    }
}
