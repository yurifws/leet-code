package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.twopointers.P125_ValidPalindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P125_ValidPalindromeTest {

    private final P125_ValidPalindrome solution = new P125_ValidPalindrome();

    @Test
    void case1() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void case2() {
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    void case3() {
        assertTrue(solution.isPalindrome(" "));
    }
}
