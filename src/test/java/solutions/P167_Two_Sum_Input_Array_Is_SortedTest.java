package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.twopointers.P167_Two_Sum_Input_Array_Is_Sorted;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P167_Two_Sum_Input_Array_Is_SortedTest {

    private final P167_Two_Sum_Input_Array_Is_Sorted solution = new P167_Two_Sum_Input_Array_Is_Sorted();

    //numbers = [2,7,11,15]
    @Test
    void case1() {
        int[] actual = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(1, actual[0]);
        assertEquals(2, actual[1]);
    }

    @Test
    void case2() {
        int[] actual = solution.twoSum(new int[]{2,3,4}, 6);
        assertEquals(1, actual[0]);
        assertEquals(3, actual[1]);
    }

    @Test
    void case3() {
        int[] actual = solution.twoSum(new int[]{-1,0}, -1);
        assertEquals(1, actual[0]);
        assertEquals(2, actual[1]);
    }
}
