package solutions.binarysearch;

import java.util.Arrays;

/**
 * #704 - Binary Search
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/binary-search
 *
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 < nums[i], target < 104
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 *
 *
 * Seen this question in a real interview before?
 * 1/5
 *
 */
public class P704_Binary_Search {


    /**
     *
     * @param nums
     * @param target
     * @return
     *
     *
     * Iteration 1:
     * mid = (0 + 5) / 2 = 2
     * nums[2] = 3
     *
     * 3 < 9, so left = mid + 1 = 3
     * "Target is bigger, so ignore everything to the left of mid"
     *
     * Iteration 2:
     * mid = (3 + 5) / 2 = 4
     * nums[4] = 9
     *
     * 9 == 9, return 4 ✅
     */
//    public int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left <= right){
//            int mid = (left + right) / 2;
//            if(nums[mid] > target){
//                right = mid - 1 ;
//            }else if(nums[mid] < target){
//                left = mid + 1;
//            }else {
//                return mid;
//            }
//
//        }
//        return -1;
//    }
    //TODO WITH RECURSION
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    private int helper(int[] nums, int target, int left, int right) {
        if (left > right) return -1;

        int mid = (left + right) / 2;

        if (nums[mid] > target){
            return helper(nums, target, left, mid - 1);
        }else if (nums[mid] < target){
            return helper(nums, target, mid + 1, right);
        }else {
            return mid;
        }
    }

    public static void main(String[] args) {
        new P704_Binary_Search().search(new int[]{-1,0,3,5,9,12}, 9);
    }
}
