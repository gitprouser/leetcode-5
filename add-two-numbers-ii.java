/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1=reverse(l1);
        ListNode r2=reverse(l2);
        return reverse(add(r1,r2));
    }
    public ListNode add(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode p3 = result;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            p3.next = new ListNode(carry % 10);
            carry = carry / 10;
            p3 = p3.next;
        }
        if (carry == 1) {
            p3.next = new ListNode(1);
        }
        return result.next;
     }
    public ListNode reverse(ListNode head){
        if(head==null) return null;
        ListNode pre= null;
        while(head!=null){
            ListNode temp = head.next;
            head.next=pre;
            pre=head;
            head=temp;
        }
        return pre;
    }
}
