package _07_stacks_and_queues;

import java.util.Arrays;
import java.util.Stack;

public class _08_daily_temperatures {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int n = temperatures.length;

        int[] nextGreaterRightIndex = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int index = n - 1; index >= 0; index--) {
            int currentVal = temperatures[index];
            while (!stack.isEmpty() && currentVal >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextGreaterRightIndex[index] = 0;
            } else {
                nextGreaterRightIndex[index] = stack.peek() - index;
            }
            stack.add(index);
        }

        System.out.println(Arrays.toString(nextGreaterRightIndex));

    }
}
