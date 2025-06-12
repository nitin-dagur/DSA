/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun sortedListToBST(head: ListNode?): TreeNode? {
        if (head == null) return null
        if (head.next == null) return TreeNode(head.`val`)

        // Helper function to find the middle node of the list
        fun findMiddle(start: ListNode?): Pair<ListNode?, ListNode?> {
            var prev: ListNode? = null
            var slow = start
            var fast = start

            while (fast?.next != null && fast.next?.next != null) {
                prev = slow
                slow = slow?.next
                fast = fast.next?.next
            }

            // Disconnect the left half
            prev?.next = null
            return Pair(start, slow)
        }

        val (leftHead, midNode) = findMiddle(head)
        val root = TreeNode(midNode!!.`val`)

        if (head !== midNode) {
            root.left = sortedListToBST(leftHead)
        }
        root.right = sortedListToBST(midNode.next)

        return root
    }
}
