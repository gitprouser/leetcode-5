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
    public int sumNumbers(TreeNode root) {
        if (root==null){
            return 0;
        }   
        return helper(root,0);
    }
    
    public int helper(TreeNode root,int pre){
        if(root==null){
            return 0;
        }
        int cur = pre*10+root.val;
        if(root.left==null&&root.right==null){
            return cur;
        }else{
            return helper(root.left,cur)+helper(root.right,cur);
        }
    }
}
