package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.binarysearch.P875_Koko_Eating_Bananas;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P875_Koko_Eating_BananasTest {

    private final P875_Koko_Eating_Bananas solution = new P875_Koko_Eating_Bananas();


    //Input: piles = [3,6,7,11], h = 8
    @Test
    void case1() {
        assertEquals(4, solution.minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

    //Input: piles = [30,11,23,4,20], h = 5
    @Test
    void case2() {
        assertEquals(30, solution.minEatingSpeed(new int[]{30,11,23,4,20}, 5));
    }

    //Input: piles = [30,11,23,4,20], h = 6
    @Test
    void case3() {
        assertEquals(23, solution.minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }
}
