/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return ;
        }
        TreeLinkNode p = root;
        TreeLinkNode first=null;
        while(p!=null){
            if(first==null){
                first=p.left;
            }
            if(p.left!=null){
                p.left.next=p.right;
            }else{
                break;
            }
            if(p.next!=null){
                p.right.next=p.next.left;
                p=p.next;
                continue;
            }else{
                p=first;
                first=null;
            }
        }
        
    }
    
}
