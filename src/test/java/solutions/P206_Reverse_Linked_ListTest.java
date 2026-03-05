package solutions;

import org.junit.jupiter.api.Test;
import solutions.linkedlist.P206_Reverse_Linked_List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class P206_Reverse_Linked_ListTest {

    private final P206_Reverse_Linked_List solution = new P206_Reverse_Linked_List();

    @Test
    void case1() {
        assertEquals(new P206_Reverse_Linked_List.ListNode(5,
                new P206_Reverse_Linked_List.ListNode(4,
                        new P206_Reverse_Linked_List.ListNode(3,
                                new P206_Reverse_Linked_List.ListNode(2,
                                        new P206_Reverse_Linked_List.ListNode(1))
                        )
                )
        ),
                solution.reverseList(new P206_Reverse_Linked_List.ListNode(1,
                        new P206_Reverse_Linked_List.ListNode(2,
                                new P206_Reverse_Linked_List.ListNode(3,
                                        new P206_Reverse_Linked_List.ListNode(4,
                                                new P206_Reverse_Linked_List.ListNode(5))
                                )
                        )
                )
                )
        );
    }

    @Test
    void case2() {
        assertEquals(new P206_Reverse_Linked_List.ListNode(), solution.reverseList(new P206_Reverse_Linked_List.ListNode()));
    }

}
