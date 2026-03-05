package solutions;

import org.junit.jupiter.api.Test;
import solutions.linkedlist.P206_Reverse_Linked_List;
import solutions.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;


class P206_Reverse_Linked_ListTest {

    private final P206_Reverse_Linked_List solution = new P206_Reverse_Linked_List();

    @Test
    void case1() {
        assertEquals(new ListNode(5,new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))))),
                solution.reverseList(
                        new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
    }

    @Test
    void case2() {
        assertEquals(new ListNode(), solution.reverseList(new ListNode()));
    }

}
