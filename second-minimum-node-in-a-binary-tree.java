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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null){
            return -1;
        }
        int k = root.val;
        return helper(root,k);
    }
    
    public int helper(TreeNode root,int k){
        if(root==null){
            return -1;
        }
        if(root.val!=k){
            return root.val;
        }
        int left = helper(root.left,k);
        int right = helper(root.right,k);
         return (left == -1 || right == -1) ? Math.max(left, right) : Math.min(left, right);
    }
}
