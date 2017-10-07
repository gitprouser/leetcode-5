/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode f = head;
        ListNode s = head;
        while(f.next!=null && f.next.next!=null) {
            f = f.next.next;
            s = s.next;
        }
        ListNode p2 = sortList(s.next);
        s.next=null;
        ListNode p1 = sortList(head);
        return merge(p1,p2);
    }
    public ListNode merge(ListNode l,ListNode r){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(l!=null&&r!=null){
            if(l.val<r.val){
                tail.next = l;
                l=l.next;
            }else{
                tail.next=r;
                r=r.next;
            }
            tail = tail.next;
        }
        if(l!=null){
            tail.next = l;
        }else{
            tail.next = r;
        }
        return dummy.next;
    }
}
