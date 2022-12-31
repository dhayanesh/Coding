class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = new ListNode();
        ListNode list3 = mergeList;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                list3.next = list1;
                list1 = list1.next; 
            }
            else {
                list3.next = list2;
                list2 = list2.next;
            }
            list3 = list3.next;
        }
        
        if(list1 != null) {
            list3.next = list1;
        }
        if(list2 != null) {
            list3.next = list2;
        } 

        return mergeList.next;

    }
}
