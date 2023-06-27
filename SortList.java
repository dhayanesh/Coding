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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        ListNode temp2 = head;
        int i = 0;
        while(temp2 != null) {
            temp2.val = list.get(i);
            temp2 = temp2.next;
            i++;
        }
        return head;
    }
}
