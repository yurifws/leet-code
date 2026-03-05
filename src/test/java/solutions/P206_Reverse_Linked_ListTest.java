package solutions;

import org.junit.jupiter.api.Test;
import solutions.linkedlist.P206_Reverse_Linked_List;
import solutions.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;


class P206_Reverse_Linked_ListTest {

    private final P206_Reverse_Linked_List solution = new P206_Reverse_Linked_List();

    @Test
    void case1() {
        ListNode actual = solution.reverseList(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        assertEquals(5, actual.val);
        assertEquals(4, actual.next.val);
        assertEquals(3, actual.next.next.val);
        assertEquals(2, actual.next.next.next.val);
        assertEquals(1, actual.next.next.next.next.val);
    }

    @Test
    void case2() {
        ListNode expected = new ListNode();
        ListNode actual = solution.reverseList(new ListNode());
        assertEquals(expected.val, actual.val);
    }

}
