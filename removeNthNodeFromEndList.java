class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode temp = head;
        ListNode temp2 = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }

        if(n == count) 
            return head.next;
            
        for(int i = 0; i < count; i++) {
            if(i == count - n - 1){
                temp2.next = temp2.next.next;
                break;
            }

            temp2 = temp2.next;
        }
        return head;

    }
}
