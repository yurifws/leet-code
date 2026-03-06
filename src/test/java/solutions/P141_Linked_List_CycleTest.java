package solutions;

import org.junit.jupiter.api.Test;
import solutions.linkedlist.P141_Linked_List_Cycle;
import solutions.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P141_Linked_List_CycleTest {

    private final P141_Linked_List_Cycle solution = new P141_Linked_List_Cycle();

    @Test
    void case1() {

        ListNode listNode = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;


        assertTrue(solution.hasCycle(listNode));
    }

    @Test
    void case2() {

        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);

        listNode.next = listNode2;
        listNode2.next = listNode;


        assertTrue(solution.hasCycle(listNode));
    }

    @Test
    void case3() {

        ListNode listNode = new ListNode(1, null);

        assertFalse(solution.hasCycle(listNode));
    }
}
