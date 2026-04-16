package _07_stacks_and_queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int size = queue.size();
        int index = 1;
        while (!queue.isEmpty() && index < size) {
            int removedVal = queue.remove();
            queue.add(removedVal);
            index++;
        }
        return queue.isEmpty() ? -1 : queue.remove();
    }
    public int top() {
        int size = queue.size();
        int index = 1;
        while (!queue.isEmpty() && index < size) {
            int removedVal = queue.remove();
            queue.add(removedVal);
            index++;
        }
        int top = queue.isEmpty() ? -1 : queue.peek();
        queue.remove();
        queue.add(top);
        return queue.isEmpty() ? -1 : top;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
