//http://www.cnblogs.com/grandyang/p/4298069.html
//http://www.cnblogs.com/AnnieKim/archive/2013/06/15/MorrisTraversal.html
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
    public void recoverTree(TreeNode root) {
        TreeNode pre=null,cur=root,p1=null,p2=null,preCur=null;
        boolean found=false;
        if(root==null){
            return;
        }
        while(cur!=null){
            if(cur.left==null){
                if(preCur!=null&&preCur.val>cur.val){
                    if(found==false){
                        p1=preCur;
                        found=true;
                    }
                    p2=cur;
                }
                preCur=cur;
                cur=cur.right;
            }else{
                pre=cur.left;
                while(pre.right!=null&&pre.right!=cur){
                    pre=pre.right;
                }
                if(pre.right==null){
                    pre.right=cur;
                    cur=cur.left;
                }else{
                    pre.right=null;
                    if(cur.val<preCur.val){
                        if(found==false){
                            p1=preCur;
                            found=true;
                        }
                        p2=cur;
                    }
                    preCur=cur;
                    pre.right=null;
                    cur=cur.right;
                }
            }
        }
        if(p1!=null&&p2!=null){
            int temp = p2.val;
            p2.val=p1.val;
            p1.val=temp;
        }
    }
}
