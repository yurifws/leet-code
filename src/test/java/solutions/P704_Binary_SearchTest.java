package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.binarysearch.P704_Binary_Search;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P704_Binary_SearchTest {

    private final P704_Binary_Search solution = new P704_Binary_Search();

    @Test
    void case1() {
        assertEquals(4, solution.search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    void case2() {
        assertEquals(-1, solution.search(new int[]{-1,0,3,5,9,12}, 2));
    }
}
