package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.stack.P20_Valid_Parentheses;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P20_Valid_ParenthesesTest {

    private final P20_Valid_Parentheses solution = new P20_Valid_Parentheses();

    @Test
    void case1() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void case2() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void case3() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void case4() {
        assertTrue(solution.isValid("([])"));
    }

    @Test
    void case5() {
        assertFalse(solution.isValid("([)]"));
    }
}
