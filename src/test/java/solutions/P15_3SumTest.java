package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.twopointers.P15_3Sum;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P15_3SumTest {

    private final P15_3Sum solution = new P15_3Sum();

    //[-1, 0, 1, 2, -1, -4]
    @Test
    void case1() {
        List<List<Integer>> actual = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(List.of(-1,-1,2), actual.get(0));
        assertEquals(List.of(0,-1,1),  actual.get(1));
    }
    //[0,1,1]
    @Test
    void case2() {
        List<List<Integer>> actual = solution.threeSum(new int[]{0,1,1});
        assertEquals(new ArrayList<>(), actual);
    }

    @Test
    void case3() {
        List<List<Integer>> actual = solution.threeSum(new int[]{0,0,0});
        assertEquals(List.of(0,0,0), actual.get(0));
    }
}
