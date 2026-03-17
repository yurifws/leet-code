package solutions;

import org.junit.jupiter.api.Test;
import solutions.stack.P150_Evaluate_Reverse_Polish_Notation;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P150_Evaluate_Reverse_Polish_NotationTest {

    private final P150_Evaluate_Reverse_Polish_Notation solution = new P150_Evaluate_Reverse_Polish_Notation();

    @Test
    void case1() {
        assertEquals(9, solution.evalRPN(new String[]{"2","1","+","3","*"}));
    }

    @Test
    void case2() {
        assertEquals(6, solution.evalRPN(new String[]{"4","13","5","/","+"}));
    }

    @Test
    void case3() {
        assertEquals(22, solution.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
