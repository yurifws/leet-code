package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.arrays.P347_Top_K_Frequent_Elements;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P347_Top_K_Frequent_ElementsTest {

    private final P347_Top_K_Frequent_Elements solution = new P347_Top_K_Frequent_Elements();

    @Test
    void case1() {

        int[] actual = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        assertEquals(2, actual[0]);
        assertEquals(1, actual[1]);
    }

    @Test
    void case2() {

        int[] actual = solution.topKFrequent(new int[]{1}, 1);
        assertEquals(1, actual[0]);
    }

    @Test
    void case3() {

        int[] actual = solution.topKFrequent(new int[]{1,2,1,2,1,2,3,1,3,2}, 2);
        assertEquals(1, actual[0]);
        assertEquals(2, actual[1]);
    }
}
