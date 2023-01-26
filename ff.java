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
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        StringBuilder sb = new StringBuilder();
        while(node != null) {
            int temp = node.val;
            sb.append(temp);
            node = node.next;
        }
        String str1 = sb.toString();
        String str2 = sb.reverse().toString();
        return str1.equals(str2);
    }
}
