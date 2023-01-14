class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int val1 = 0, val2 = 0;
            if(l1 != null)
                val1 = l1.val;
            if(l2 != null)
                val2 = l2.val;
            
            int sum = val1 + val2 + carry;

            carry = sum / 10;
            sum = sum % 10;
            temp.next = new ListNode(sum);
            temp = temp.next;

            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;                        

        }
        return result.next;
    }
}
