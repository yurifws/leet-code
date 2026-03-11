package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.heap.P1046_Last_Stone_Weight;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P1046_Last_Stone_WeightTest {

    private final P1046_Last_Stone_Weight solution = new P1046_Last_Stone_Weight();

    @Test
    void case1() {
        assertEquals(1, solution.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

    @Test
    void case2() {
        assertEquals(1, solution.lastStoneWeight(new int[]{1}));
    }

}
