package solutions;

import org.junit.jupiter.api.Test;
import solutions.binarysearch.P74_Search_a_2D_Matrix;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P74_Search_a_2D_MatrixTest {

    private final P74_Search_a_2D_Matrix solution = new P74_Search_a_2D_Matrix();

    @Test
    void case1() {

        int[][] matrix = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        assertTrue(solution.searchMatrix(matrix, 3));

    }

    @Test
    void case2() {
        int[][] matrix = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        assertFalse(solution.searchMatrix(matrix, 13));
    }
}
