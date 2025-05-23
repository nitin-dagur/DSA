class Solution {
    public Node deleteNode(Node head, int x) {
        // Case 1: Deleting the head (x == 1)
        if (x == 1) {
            return head.next;
        }

        Node current = head;

        // Traverse to the (x-1)th node
        for (int i = 1; i < x - 1; i++) {
            current = current.next;
        }

        // If the node to delete exists
        
        current.next = current.next.next;
        

        return head;
    }
}
