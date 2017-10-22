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
    public void flatten(TreeNode root) {
        if (root==null){
            return ;
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode t = st.pop();
            if(t.left!=null){
                TreeNode r = t.left;
                while(r.right!=null) r= r.right;
                r.right=t.right;
                t.right=t.left;
                t.left=null;
            }
            if(t.right!=null) st.push(t.right);
        }
    }
}
