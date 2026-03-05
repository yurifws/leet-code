package solutions.slidingwindow;

/**
 * #121 - Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 *
 * Constraints:
 *
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 *
 */
public class P121_Best_Time_to_Buy_and_Sell_Stock {
//    public int maxProfit(int[] prices) {
//
//        int profit = 0;
//        for (int i = 0; i < prices.length ; i++) {
//            int buy = prices[i];
//            for (int j = i + 1; j < prices.length; j++) {
//                int sell = prices[j];
//                if(buy < sell) {
//                    int tryProfit = sell - buy;
//                    if(tryProfit > profit){
//                        profit = tryProfit;
//                    }
//                }
//            }
//        }
//        return profit;
//    }

    public int maxProfit(int[] prices) {

        int profit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            // 1. Can you update minPrice?
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // 2. Can you update profit?
            int tryProfit = prices[i] - minPrice;
            if(tryProfit > profit) {
                profit = tryProfit;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        new P121_Best_Time_to_Buy_and_Sell_Stock().maxProfit(new int[]{7,1,5,3,6,4});
    }
}
