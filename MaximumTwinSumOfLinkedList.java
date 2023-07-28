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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int len = 0, max = 0;
        while(temp != null) {
            temp = temp.next;
            len++;
        }

        int[] arr = new int[len/2];
        temp = head;
        
        for(int i = 0; i < len/2; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }

        for(int i = 0; i < len/2; i++) {
            int sum = temp.val + arr[arr.length - i - 1];
            max = Math.max(max, sum);
            temp = temp.next;
        }

        return max;
    }
}
