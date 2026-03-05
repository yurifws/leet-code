package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.linkedlist.P21_Merge_Two_Sorted_Lists;
import solutions.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P21_Merge_Two_Sorted_ListsTest {

    private final P21_Merge_Two_Sorted_Lists solution = new P21_Merge_Two_Sorted_Lists();

    //
 //* Output: [1,1,2,3,4,4]
    @Test
    void case1() {
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode actual = solution.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4))));
        assertEquals(1, actual.val);
        assertEquals(1, actual.next.val);
        assertEquals(2, actual.next.next.val);
        assertEquals(3, actual.next.next.next.val);
        assertEquals(4, actual.next.next.next.next.val);
        assertEquals(4, actual.next.next.next.next.next.val);
    }

    @Test
    void case2() {
        ListNode expected = new ListNode();
        ListNode actual = solution.mergeTwoLists(new ListNode(), new ListNode());
        assertEquals(expected.val, actual.val);
    }

    @Test
    void case3() {
        ListNode expected = new ListNode(0);
        ListNode actual = solution.mergeTwoLists(new ListNode(), new ListNode(0));
        assertEquals(expected.val, actual.val);
    }
}
