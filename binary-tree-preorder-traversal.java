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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                res.add(cur.val);
                stack.push(cur);
                cur= cur.left;    
            }
            if(!stack.isEmpty()){
                cur = stack.pop();
                cur=cur.right;
            }
        }
        return res;
    }
}
