package solutions.linkedlist;

import solutions.utils.ListNode;

/**
 * #2 - Add Two Numbers
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/add-two-numbers/
 *
 * Two non-empty linked lists represent two non-negative integers stored in reverse order.
 * Add the two numbers and return the sum as a linked list (also in reverse order).
 *
 * Time:  O(max(m, n))
 * Space: O(max(m, n))
 */
public class P2_Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }
}
