package solutions.binarysearch;

/**
 * #875. Koko Eating Bananas
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/koko-eating-bananas
 *
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
 *
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 *
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 *
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 *
 *
 *
 * Example 1:
 *
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 * Example 2:
 *
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 * Example 3:
 *
 * Input: piles = [30,11,23,4,20], h = 6
 * Output: 23
 *
 *
 * Constraints:
 *
 * 1 <= piles.length <= 104
 * piles.length <= h <= 109
 * 1 <= piles[i] <= 109
 *
 */
public class P875_Koko_Eating_Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile: piles){
            right = Math.max(right, pile);
        }

        while(left < right){

            int mid = left + (right - left) / 2;
            double totalHours = 0;
            for (int pile : piles) {
                totalHours += Math.ceil((double)pile / mid);
            }

            if (totalHours > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public int minEatingSpeedRecursive(int[] piles, int h) {
        int right = 0;
        for (int pile: piles){
            right = Math.max(right, pile);
        }

        return binarySearch(piles, h, 1, right);
    }

    int binarySearch(int[] piles, int h, int left, int right) {
        if (left >= right) return left;

        int mid = left + (right - left) / 2;
        int totalHours = 0;
        for (int pile: piles){
            totalHours += (pile + mid - 1) / mid;
        }

        if (totalHours > h) {
            return binarySearch(piles, h, mid + 1, right);  // go faster
        } else {
            return binarySearch(piles, h, left, mid);   // try slower
        }
    }

    public static void main(String[] args) {
        new P875_Koko_Eating_Bananas().minEatingSpeed(new int[]{3,6,7,11}, 8);
    }
}
