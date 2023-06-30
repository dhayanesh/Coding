/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode tempLeft = head, tempRight = head;

        if (head == null || head.next == null || left == right)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevNode = dummy;

        for (int i = 1; i < left; i++) {
            prevNode = prevNode.next;  //left - 1
        }

        ListNode startNode = prevNode.next;  //left
        ListNode thenNode = startNode.next;  //left + 1

        for (int i = left; i < right; i++) {
            startNode.next = thenNode.next;
            thenNode.next = prevNode.next;
            prevNode.next = thenNode;
            thenNode = startNode.next;
        }
        
        return dummy.next;

    }
}
