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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(root,sum,0,res,new ArrayList<Integer>());
        return res;
    }
    public void helper(TreeNode root,int num,int presum,List<List<Integer>> res,List<Integer> temp){
        if(root==null){
            return ;
        }
        if(root.left==null&&root.right==null){
            if(presum+root.val==num){
                temp.add(root.val);
                res.add(new ArrayList<Integer>(temp));
                temp.remove(temp.size()-1);
                return ;
            }
        }
        if(root.left!=null){
            temp.add(root.val);
            helper(root.left,num,presum+root.val,res,temp);
            temp.remove(temp.size()-1);
        }
        if(root.right!=null){
            temp.add(root.val);
            helper(root.right,num,presum+root.val,res,temp);
            temp.remove(temp.size()-1);
        }
        return ;
    }
}
