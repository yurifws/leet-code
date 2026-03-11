package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.heap.P703_Kth_Largest_Element_in_a_Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P703_Kth_Largest_Element_in_a_StreamTest {

    private final P703_Kth_Largest_Element_in_a_Stream solution = new P703_Kth_Largest_Element_in_a_Stream();

    //[[3,[4,5,8,2]],[3],[5],[10],[9],[4]]
    @Test
    void case1() {
        P703_Kth_Largest_Element_in_a_Stream.KthLargest kthLargest = new P703_Kth_Largest_Element_in_a_Stream.KthLargest(3, new int[]{4, 5, 8, 2});
        assertEquals(4, kthLargest.add(3));
        assertEquals(5, kthLargest.add(5));
        assertEquals(5, kthLargest.add(10));
        assertEquals(8, kthLargest.add(9));
        assertEquals(8, kthLargest.add(4));

    }

    //[[4,[7,7,7,7,8,3]],[2],[10],[9],[9]]
    @Test
    void case2() {
        P703_Kth_Largest_Element_in_a_Stream.KthLargest kthLargest = new P703_Kth_Largest_Element_in_a_Stream.KthLargest(4, new int[]{7,7,7,7,8,3});
        assertEquals(7, kthLargest.add(2));
        assertEquals(7, kthLargest.add(10));
        assertEquals(7, kthLargest.add(9));
        assertEquals(8, kthLargest.add(9));
    }

}
