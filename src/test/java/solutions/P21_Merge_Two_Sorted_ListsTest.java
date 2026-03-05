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
        assertEquals(new ListNode(1,new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4)))))),
                solution.mergeTwoLists(
                        new ListNode(1, new ListNode(2, new ListNode(4))),
                        new ListNode(1, new ListNode(3, new ListNode(4)))));
    }

    @Test
    void case2() {
        assertEquals(new ListNode(),
                solution.mergeTwoLists(new ListNode(),new ListNode()));
    }

    @Test
    void case3() {
        assertEquals(new ListNode(0),
                solution.mergeTwoLists( new ListNode(), new ListNode(0)));
    }
}
