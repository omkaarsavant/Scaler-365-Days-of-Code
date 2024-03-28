public class Solution {
    public String reverseString(String A) {
        
        Stack<Character> stack = new Stack<>();
        for (char c : A.toCharArray()) {
            stack.push(c);
        }
        
        // Pop characters from the stack to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        return reversed.toString();
    }
}
