package solutions.binarysearch;

/**
 * #74 - Search a 2D Matrix
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/search-a-2d-matrix/
 *
 * You are given an m x n integer matrix matrix with the following two properties:
 *
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 *
 * You must write a solution in O(log(m * n)) time complexity.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * Example 2:
 *
 *
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 *
 *
 * Constraints:
 *
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -104 <= matrix[i][j], target <= 104
 *
 *
 * **How the window moves:**
 * ```
 * left=0, right=11, mid=5, val=11
 * target=3, 11 > 3 → right = mid-1 = 4
 *
 * left=0, right=4, mid=2, val=5
 * target=3, 5 > 3 → right = mid-1 = 1
 *
 * left=0, right=1, mid=0, val=1
 * target=3, 1 < 3 → left = mid+1 = 1
 *
 * left=1, right=1, mid=1, val=3
 * target=3, 3 == 3 → return true! ✅
 */
public class P74_Search_a_2D_Matrix {

    //matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            int val = matrix[mid / col][ mid % col];
            if(val == target) {
                return true;
            }else if(val > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return false;
    }

    public boolean searchMatrixRecursive(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        return helper(matrix, target, col, 0, row * col - 1);
    }

    private boolean helper(int[][] matrix, int target,int col, int left, int right) {
        if(left > right){
            return false;
        }

        int mid = left + (right - left) / 2;
        int val = matrix[mid / col][ mid % col];

        if(val == target){
            return true;
        } else if(val > target){
            return helper(matrix, target, col, left, mid - 1);
        }else {
            return helper(matrix, target, col, mid + 1, right);
        }
    }

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        new P74_Search_a_2D_Matrix().searchMatrix(matrix, 3);
    }
}
