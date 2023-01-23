public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                while(temp != fast) {
                    fast = fast.next;
                    temp = temp.next;
                }
                return temp;
            }            
        }
        return null;        
    }
}
