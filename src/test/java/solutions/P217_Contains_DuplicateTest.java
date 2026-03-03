package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P217_Contains_Duplicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P217_Contains_DuplicateTest {
    private final P217_Contains_Duplicate solution = new P217_Contains_Duplicate();

    @Test
    void case1() {
        assertTrue(solution.containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    void case2() {
        assertFalse( solution.containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    void case3() {
        assertTrue(solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
