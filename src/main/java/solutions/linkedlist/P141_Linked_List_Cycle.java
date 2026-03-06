package solutions.linkedlist;


import solutions.utils.ListNode;

/**
 * #141 -  Linked List Cycle
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/linked-list-cycle
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 * Example 2:
 *
 *
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 * Example 3:
 *
 *
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 *
 *
 * Constraints:
 *
 * The number of the nodes in the list is in the range [0, 104].
 * -105 <= Node.val <= 105
 * pos is -1 or a valid index in the linked-list.
 *
 *
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 *
 */
public class P141_Linked_List_Cycle {

    /**
     * EXPLANING
     *
     * index:  0    1    2    3
     *         3 → 2 → 0 → -4
     *              ↑_________↓
     *  slow = 3  (head)
     *  fast = 3  (head)
     *
     *  STEP1
     *  slow = slow.next;       // slow moves 1 step
     * fast = fast.next.next;  // fast moves 2 steps
     * ```
     * ```
     *         3 → 2 → 0 → -4
     *              ↑_________↓
     *
     * slow =       2
     * fast =            0
     *
     * STEP2
     * slow = slow.next;       // slow moves 1 step
     * fast = fast.next.next;  // fast moves 2 steps
     * ```
     * ```
     *         3 → 2 → 0 → -4
     *              ↑_________↓
     *
     * slow =            0
     * fast =            0    (−4 → back to 2 → lands on 0)
     * ```
     * `slow == fast? YES` → return `true`!
     *
     * ---
     *
     * ### Why does fast land on 0?
     * ```
     * fast was at 0
     * fast.next     = -4
     * fast.next.next = 2    // -4 points back to 2
     * ```
     * Wait, that lands on `2` not `0`... let me redo:
     *
     * ### Corrected Step 2
     * ```
     * slow was at 2  → slow.next = 0
     * fast was at 0  → fast.next = -4 → fast.next.next = 2
     * ```
     * ```
     * slow = 0
     * fast = 2
     * ```
     * `slow == fast? NO` → keep looping
     *
     * ---
     *
     * ### Step 3
     * ```
     * slow was at 0  → slow.next = -4
     * fast was at 2  → fast.next = 0 → fast.next.next = -4
     * ```
     * ```
     * slow = -4
     * fast = -4
     *
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    //* Input: head = [3,2,0,-4], pos = 1
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;


        new P141_Linked_List_Cycle().hasCycle(listNode);
    }
}
