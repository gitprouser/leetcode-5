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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preOrder(p,q);
    }
    public boolean preOrder(TreeNode p, TreeNode q){
         
        if(p==q&&p==null){
            return true;
        }else{   
            if((p==null)||(q==null)||(p.val!=q.val)){
                return false;
            }   
        }
        boolean left = preOrder(p.left,q.left);
        boolean right = preOrder(p.right,q.right);
        return left&&right;
    }
}
