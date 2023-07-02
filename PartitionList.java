class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return head;

        ListNode lesser = new ListNode(0);
        ListNode greater = new ListNode(0);

        ListNode temp1 = lesser;
        ListNode temp2 = greater;

        while(head != null) {
            if(head.val < x) {
                temp1.next = head;
                temp1 = temp1.next;
            }
            else {
                temp2.next = head;
                temp2 = temp2.next;
            }
            head = head.next;
        }
        
        temp2.next = null; //to avoid cycle
        temp1.next = greater.next;
        return lesser.next;
    }
}
