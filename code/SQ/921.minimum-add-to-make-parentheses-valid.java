/*
 * @lc app=leetcode id=921 lang=java
 *
 * [921] Minimum Add to Make Parentheses Valid
 */

// @lc code=start
import java.util.Stack;
class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    char top = stack.peek();
                    if (top == '(' && c == ')') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
        }
        return stack.size();
    }

}

// @lc code=end
