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
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0, tempVal = 0;
        ListNode temp = head;
        while(temp != null) {
            len++;
            temp = temp.next;
        }

        temp = head;
        for(int i = 0; i < k - 1; i++) {
            temp = temp.next;
        }
        

        ListNode temp2 = head;
        for(int i = 0; i < len - k; i++) {
            temp2 = temp2.next;
        }

        tempVal = temp.val;
        temp.val = temp2.val;
        temp2.val = tempVal;

        return head;
    }
}
