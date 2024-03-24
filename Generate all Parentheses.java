public class Solution {
    public int isValid(String A) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
