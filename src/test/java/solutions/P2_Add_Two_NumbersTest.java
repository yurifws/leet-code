package solutions;

import org.junit.jupiter.api.Test;
import solutions.linkedlist.P2_Add_Two_Numbers;
import solutions.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P2_Add_Two_NumbersTest {

    private final P2_Add_Two_Numbers solution = new P2_Add_Two_Numbers();

    // l1 = [2,4,3], l2 = [5,6,4] → 342 + 465 = 807 → [7,0,8]
    @Test
    void case1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    // l1 = [0], l2 = [0] → 0 + 0 = 0 → [0]
    @Test
    void case2() {
        ListNode result = solution.addTwoNumbers(new ListNode(0), new ListNode(0));
        assertEquals(0, result.val);
    }

    // l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] → 9999999 + 9999 = 10009998 → [8,9,9,9,0,0,0,1]
    @Test
    void case3() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                      new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(8, result.val);
        assertEquals(9, result.next.val);
        assertEquals(9, result.next.next.val);
        assertEquals(9, result.next.next.next.val);
        assertEquals(0, result.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.next.val);
        assertEquals(1, result.next.next.next.next.next.next.next.val);
    }
}
