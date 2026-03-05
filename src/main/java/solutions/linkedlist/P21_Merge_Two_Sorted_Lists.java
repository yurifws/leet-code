package solutions.linkedlist;

import solutions.utils.ListNode;

/**
 * #21 - Merge Two Sorted Lists
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/merge-two-sorted-lists
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 *
 */
public class P21_Merge_Two_Sorted_Lists{

    /*
    ---

### Visual Example
```
list1: 1 -> 2 -> 4
list2: 1 -> 3 -> 4

step 1: equal → pick list1(1)    → result: 1
step 2: equal → pick list1(2)? No, compare 2 vs 1 → pick list2(1) → result: 1->1
step 3: 2 < 3  → pick list1(2)  → result: 1->1->2
step 4: 3 < 4  → pick list2(3)  → result: 1->1->2->3
step 5: equal  → pick list1(4)  → result: 1->1->2->3->4
step 6: list2 still has 4 → attach remainder → result: 1->1->2->3->4->4

     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        boolean l1Empty = (list1 == null || list1.isEmpty);
        boolean l2Empty = (list2 == null || list2.isEmpty);

        if (l1Empty && l2Empty) return new ListNode(); // case2: [] + [] = []
        if (l1Empty) return list2;                     // case3: [] + [0] = [0]
        if (l2Empty) return list1;


        while (list1 != null && list2 != null) {
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            }else if(list1.val > list2.val){
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            } else {
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            }
        }

        if (list1 != null){
            curr.next = list1;
        }else {
            curr.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        new P21_Merge_Two_Sorted_Lists().mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4)))
        );
    }
}
