package solutions.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/**
 * #20 - Valid Parentheses
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-parentheses
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 * Example 5:
 *
 * Input: s = "([)]"
 *
 * Output: false
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 *
 */
public class P20_Valid_Parentheses {
        //TODO how to use deque
//    public boolean isValid(String s) {
//        Deque<Character> stack = new ArrayDeque<>();
//
//        for(char c : s.toCharArray()){
//            if(c == '(' || c == '[' || c == '{'){
//                stack.push(c);
//            }else if (c == ')'){
//                if (stack.isEmpty() || stack.pop() != '(') return false;
//            }else if (c == ']'){
//                if (stack.isEmpty() || stack.pop() != '[') return false;
//            }else if (c == '}'){
//                if (stack.isEmpty() || stack.pop() != '{') return false;
//            }
//        }
//
//        return stack.isEmpty();
//    }
    //
      public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
          map.put(')', '(');
          map.put(']', '[');
          map.put('}', '{');

        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else if (stack.isEmpty() || stack.pop() != map.get(c)) {
                return false;
            }
        }

        return stack.isEmpty();
    }



    public static void main(String[] args) {
        new P20_Valid_Parentheses().isValid("()");
    }
}
