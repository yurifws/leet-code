package solutions.utils;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            int minVal = Math.min(val, minStack.peek());
            minStack.push(minVal);
        }

    }

    public void pop() {
        stack.pop();
        if(!minStack.isEmpty()){
            minStack.pop();
        }
    }

    public int top() {
        return stack.getFirst();
    }

    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
