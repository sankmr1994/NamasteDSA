package _07_stacks_and_queues;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> main;
    Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        main.push(x);
    }

    public int pop() {
        while (!main.isEmpty()) {
            helper.push(main.pop());
        }
        int front = helper.pop();
        while (!helper.isEmpty()) {
            main.push(helper.pop());
        }
        return front;
    }

    public int peek() {
        while (!main.isEmpty()) {
            helper.push(main.pop());
        }
        int front = helper.peek();
        while (!helper.isEmpty()) {
            main.push(helper.pop());
        }
        return front;
    }

    public boolean empty() {
        return main.isEmpty();
    }
}
