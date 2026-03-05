package solutions.linkedlist;

import solutions.utils.ListNode;

/**
 * #206 - Reverse Linked List
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/reverse-linked-list
 *
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * Example 2:
 *
 *
 * Input: head = [1,2]
 * Output: [2,1]
 * Example 3:
 *
 * Input: head = []
 * Output: []
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 *
 *
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 */
public class P206_Reverse_Linked_List {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;  // save before breaking
            curr.next = prev;      // reverse the pointer
            prev = curr;           // advance prev
            curr = next;           // advance curr
        }
        return prev;
    }
    // null   1 → 2 → 3 → 4 → 5
    //interact 1
    // prev = null, curr = 1
    // next = 2
    // 1.next = null
    // prev = 1
    // curr 2

    // interact 2
    // prev = 1, curr = 2
    // next = 3
    // 2.next = 1
    // prev = 2
    // curr = 3

    // interact 3
    // prev = 2, curr = 3
    // next = 4
    // 3.next = 2
    // prev = 3
    // curr = 4

    // interact 4
    // prev = 3, curr = 4
    // next = 5
    // 4.next = 3
    // prev = 4
    // curr = 5

    // interact 5
    // prev = 4, curr = 5
    // next = null
    // 5.next = 4
    // prev = 5
    // curr = null

    public static void main(String[] args) {
        new P206_Reverse_Linked_List().reverseList(
                new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))))));
    }
}
