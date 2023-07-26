/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        
        Node temp = head;
        HashMap<Node, Node> hm = new HashMap<>();

        while(temp != null) {
            hm.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;

        while(temp != null) {
            hm.get(temp).next = hm.get(temp.next);
            hm.get(temp).random = hm.get(temp.random);
            temp = temp.next;
        }

        return hm.get(head);
    }
}
