package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P1_TwoSum;

import static org.junit.jupiter.api.Assertions.*;

class P1_TwoSumTest {
    private final P1_TwoSum solution = new P1_TwoSum();

    @Test
    void testBasicCase() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void testDuplicates() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void testSameElement() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{3, 3}, 6));
    }
}
