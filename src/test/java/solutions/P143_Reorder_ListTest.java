package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.linkedlist.P143_Reorder_List;
import solutions.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P143_Reorder_ListTest {

    private final P143_Reorder_List solution = new P143_Reorder_List();

    //[1,2,3,4]
    @Test
    void case1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
       solution.reorderList(head);

        assertEquals(1, head.val);
        assertEquals(4, head.next.val);
        assertEquals(2, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
    }

    //[1,2,3,4,5]
    @Test
    void case2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        solution.reorderList(head);

        assertEquals(1, head.val);
        assertEquals(5, head.next.val);
        assertEquals(2, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(3, head.next.next.next.next.val);
    }

    @Test
    void case3() {
    }
}
