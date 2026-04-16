package _07_stacks_and_queues;

import java.util.Stack;

public class MinStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
        mainStack.push(val);
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            int removedVal = mainStack.pop();
            if (removedVal == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
