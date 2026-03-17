package solutions.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * #347 - Top K Frequent Elements
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/top-k-frequent-elements
 *
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 *
 * Output: [1,2]
 *
 * Example 2:
 *
 * Input: nums = [1], k = 1
 *
 * Output: [1]
 *
 * Example 3:
 *
 * Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
 *
 * Output: [1,2]
 *
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *
 */
public class P347_Top_K_Frequent_Elements {
    /*
     * Example 1:
     *
     * Input: nums = [1,1,1,2,2,3], k = 2
     *
     * Output: [1,2]
     */
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int key: map.keySet()){
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        new P347_Top_K_Frequent_Elements().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
    }
}
