/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode rest =  new ListNode(0);
        ListNode merged = rest;
        if(l1==null&&l2==null){
            return null;
        }else if(l1==null&&l2!=null){
            return l2;
        }else if(l1!=null&&l2==null){
            return l1;
        }
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                merged.next = l2;
                merged = merged.next;
                l2=l2.next;
            }else{
                merged.next = l1;
                merged = merged.next;
                l1=l1.next;
            }
        }
        if(l1!=null){
            merged.next = l1;
        }else if(l2!=null){
            merged.next = l2;
        }
        return rest.next;
    }
}
