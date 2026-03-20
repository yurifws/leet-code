package solutions.linkedlist;

import solutions.utils.ListNode;

/**
 * #143 - Reorder List
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/reorder-list
 *
 * You are given the head of a singly linked-list. The list can be represented as:
 *
 * L0 → L1 → … → Ln - 1 → Ln
 * Reorder the list to be on the following form:
 *
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [1,2,3,4]
 * Output: [1,4,2,3]
 * Example 2:
 *
 *
 * Input: head = [1,2,3,4,5]
 * Output: [1,5,2,4,3]
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [1, 5 * 104].
 * 1 <= Node.val <= 1000
 *
 *
 * Starting state:
 * first half:  1 → 2 → 3
 * second half: 5 → 4
 *
 * slow = 1
 * prevSlowAfter = 5
 *
 * Iteration 1:
 * tempSlow         = slow.next         = 2
 * tempPrevSlowAfter= prevSlowAfter.next= 4
 *
 * slow.next        = prevSlowAfter  →  1 → 5
 * prevSlowAfter.next = tempSlow     →  5 → 2
 *
 * slow             = tempSlow       →  slow is now 2
 * prevSlowAfter    = tempPrevSlowAfter→ prevSlowAfter is now 4
 * List looks like: 1 → 5 → 2 → 3
 *
 * Iteration 2:
 * tempSlow         = slow.next         = 3
 * tempPrevSlowAfter= prevSlowAfter.next= null
 *
 * slow.next        = prevSlowAfter  →  2 → 4
 * prevSlowAfter.next = tempSlow     →  4 → 3
 *
 * slow             = tempSlow       →  slow is now 3
 * prevSlowAfter    = tempPrevSlowAfter→ prevSlowAfter is now null
 */
public class P143_Reorder_List {

    //L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
    public void reorderList(ListNode head) {
        // Step 1 - find middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfHead = slow.next;
        slow.next = null;

        // Step 2 - reverse second half
        ListNode prev = null;
        ListNode curr = secondHalfHead;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // Step 3 - merge
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;
            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }
    //1,2,3,4
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        new P143_Reorder_List().reorderList(head);
    }
}
