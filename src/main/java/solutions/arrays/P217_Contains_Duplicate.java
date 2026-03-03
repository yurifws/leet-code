package solutions.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * #1 - Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/contains-duplicate/description/
 *
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 *
 * Output: true
 *
 * Explanation:
 *
 * The element 1 occurs at the indices 0 and 3.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 *
 * Output: false
 *
 * Explanation:
 *
 * All elements are distinct.
 *
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 *
 * Output: true
 *
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class P217_Contains_Duplicate {
//    public boolean containsDuplicate(int[] nums) {
//        List<Integer> list = Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.toList());
//
//        List<Integer> listDistinct = list.stream().distinct().collect(Collectors.toList());
//
//        if(list.size() > listDistinct.size()) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }

//    public boolean containsDuplicate(int[] nums) {
//
//        long totalCount = nums.length;
//
//        long totalDistinctCount = Arrays.stream(nums).distinct().count();
//
//        if(totalCount > totalDistinctCount) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }

    // newSet.add(num) return false when there is a value in set
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> newSet = new HashSet<>();

//        for (int i = 0; i < nums.length; i++) {
//            if(newSet.add(nums[i]) == false) {
//                return true;
//            }
//        }
        for (int num : nums) {
            if(newSet.add(num) == false) {
                return true;
            }
        }
        return false;
    }
}
