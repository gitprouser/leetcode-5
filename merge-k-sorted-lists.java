/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;    
        }else{
            return helper(lists,0,lists.length-1);    
        }
        
    }
    public ListNode helper(ListNode[] lists,int l,int r){
        if(l<r){
            int m = (l+r)/2;
            return margeTwo(helper(lists,l,m),helper(lists,m+1,r));
        }
        return lists[l];
    }
    public ListNode margeTwo(ListNode l1,ListNode l2){
        ListNode head = new ListNode(0);
        ListNode res = head;
        if(l1==null&&l2==null){
            return null;
        }else if(l1==null&&l2!=null){
            return l2;
        }else if(l1!=null&&l2==null){
            return l1;
        }
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                res.next=l1;
                l1=l1.next;
            }else{
                res.next=l2;
                l2=l2.next;
            }
            res=res.next;
        }
        if(l1!=null){
            res.next=l1;
        }else if(l2!=null){
            res.next=l2;
        }
        return head.next;
    }
}
