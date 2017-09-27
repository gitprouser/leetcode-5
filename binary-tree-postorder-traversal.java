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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        TreeNode lastVisited=null;
        TreeNode peek= null;
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root = stack.peek();
            if(root.right==null||root.right==lastVisited){
                res.add(root.val);
                lastVisited = stack.pop();
                root=null;
            }else{
               root=root.right; 
            }
        }
        return res;
    }
}
