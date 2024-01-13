import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            String A = scanner.next(); // Input string
            System.out.println(isBalanced(A) ? 1 : 0);
        }
    }

    private static boolean isBalanced(String A) {
        Stack<Character> stack = new Stack<>();

        for (char ch : A.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // Unbalanced parentheses
                }
            }
        }

        return stack.isEmpty(); // Stack should be empty for balanced parentheses
    }
}
