package src.Stack;

import java.util.Stack;

public  class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        // Only pop from minStack if the top of stack is the same as the top of minStack
        if (!stack.isEmpty() && !minStack.isEmpty() && stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        // Always pop from the main stack
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(3);
        obj.push(1);
        obj.push(2);
        System.out.println(obj.getMin());  // Should print 1
        obj.pop();
        System.out.println(obj.getMin());  // Should still print 1
        obj.pop();
        System.out.println(obj.getMin());  // Should print 3
        obj.pop();  // Now both stacks are empty

    }
}

