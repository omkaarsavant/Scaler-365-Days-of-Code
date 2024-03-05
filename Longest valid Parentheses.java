import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String A) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); 

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }

        return maxLen;
    }
}
