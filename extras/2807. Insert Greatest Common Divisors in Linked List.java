class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            int gcdVal = gcd(current.val, current.next.val);
            ListNode gcdNode = new ListNode(gcdVal);
            gcdNode.next = current.next;
            current.next = gcdNode;
            current = gcdNode.next;  // Move to next original node
        }

        return head;
    }

    // Helper method to compute GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
