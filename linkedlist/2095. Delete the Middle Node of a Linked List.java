class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Base case: if the list has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Traverse the list with fast and slow pointers
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Delete the middle node by skipping it
        prev.next = slow.next;

        return head;
    }
}
