/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n<=0){
            return null;
        }
        ListNode end= new ListNode(0);
        end.next=head;
        ListNode left= end;
        int i=0;
        while(head.next!=null){
            head=head.next;
            i++;
            if(i>=n){
                left=left.next;
            }
        }
        left.next=left.next.next;
        return end.next;
    }
}
