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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)){
            return 0;
        }
        helper(root.left,true);
        helper(root.right,false);
        return sum;
    }
    public void helper(TreeNode root,boolean left){
        if(root==null){
            return ;
        }
        if(left&&root.left==null&&root.right==null){
            sum+=root.val;
        }
        helper(root.left,true);
        helper(root.right,false);
    }
}
