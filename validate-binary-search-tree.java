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
    List<Integer> res = new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        helper(root);
        for(int i=1;i<res.size();i++){
            if(res.get(i)<=res.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }else{
            helper(root.left);
            res.add(root.val);
            helper(root.right);
        }
    }
}
