/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null)
            return null;
        
        Node result = new Node();
        result.next = head;
        
        while(head != null) {
            if(head.child != null) {
                Node node = head.next;
                head.next = head.child;
                head.next.prev = head;
                head.child = null;

                Node lastNode = head.next;
                while(lastNode.next != null) 
                    lastNode = lastNode.next;
                
                if(node != null) {
                    lastNode.next = node;
                    node.prev = lastNode;
                }
            }
            head = head.next;
        }
        return result.next;
    }
}
