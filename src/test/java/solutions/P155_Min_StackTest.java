package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.utils.MinStack;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P155_Min_StackTest {

    private final MinStack solution = new MinStack();

    //["MinStack","push","push","push","getMin","pop","top","getMin"]
    //[[],[-2],[0],[-3],[],[],[],[]]
    @Test
    void case1() {

        //[null,null,null,null,-3,null,0,-2]

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());

    }

}
