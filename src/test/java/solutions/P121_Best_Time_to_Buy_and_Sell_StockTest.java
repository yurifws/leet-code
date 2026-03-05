package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.slidingwindow.P121_Best_Time_to_Buy_and_Sell_Stock;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P121_Best_Time_to_Buy_and_Sell_StockTest {

    private final P121_Best_Time_to_Buy_and_Sell_Stock solution = new P121_Best_Time_to_Buy_and_Sell_Stock();

    @Test
    void case1() {
        assertEquals(5, solution.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void case2() {
        assertEquals(0, solution.maxProfit(new int[]{7,6,4,3,1}));
    }

}
