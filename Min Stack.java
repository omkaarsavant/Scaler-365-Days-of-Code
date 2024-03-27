class Solution {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int x = stack.pop();
            if (x == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1; // or any other value indicating the stack is empty
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1; // or any other value indicating the stack is empty
    }
}
