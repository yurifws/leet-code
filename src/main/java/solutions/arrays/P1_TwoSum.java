package solutions.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * #1 - Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class P1_TwoSum {
    //BRUTE FORCE
//    public int[] twoSum(int[] nums, int target) {
//        int[] newArrayInt = new int[2];
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if(target == nums[i] + nums[j]){
//                    newArrayInt[0] = i;
//                    newArrayInt[1] = j;
//                }
//            }
//        }
//        return newArrayInt;
//
//    }
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashMapInt = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMapInt.containsKey(target - nums[i])) {
                return new int[] {hashMapInt.get(target - nums[i]), i};
            } else {
                hashMapInt.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new P1_TwoSum().twoSum(new int[]{3,2,4}, 6);
    }
}
