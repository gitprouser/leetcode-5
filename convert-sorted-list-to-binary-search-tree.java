/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        return build(head,null);
    }
    public TreeNode build(ListNode head,ListNode end){
        if (head==end){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=end&&fast.next!=end){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode node = new TreeNode(slow.val);
        node.left = build(head,slow);
        node.right = build(slow.next,end);
        return node;
    }
}
