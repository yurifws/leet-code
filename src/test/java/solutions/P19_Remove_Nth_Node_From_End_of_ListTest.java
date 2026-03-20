package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.linkedlist.P19_Remove_Nth_Node_From_End_of_List;
import solutions.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P19_Remove_Nth_Node_From_End_of_ListTest {

    private final P19_Remove_Nth_Node_From_End_of_List solution = new P19_Remove_Nth_Node_From_End_of_List();

    //[1,2,3,4,5]
    @Test
    void case1() {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = solution.removeNthFromEnd(head, 2);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(5, result.next.next.next.val);
    }

    @Test
    void case2() {
        ListNode head = new ListNode(1);
        ListNode result = solution.removeNthFromEnd(head, 1);
        assertEquals(null, result);
    }

    @Test
    void case3() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = solution.removeNthFromEnd(head, 2);
        assertEquals(2, result.val);
    }
}
