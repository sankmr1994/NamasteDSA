package _07_stacks_and_queues;

import java.util.Arrays;
import java.util.Stack;

public class _09_next_greater_element_II {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        int n = nums.length;
        Stack<Integer> rightStack = new Stack<>();
        int[] ans = new int[n];

        for (int index = n * 2 - 1; index >= 0; index--) {
            int currentVal = nums[index % n];
            while (!rightStack.isEmpty() && currentVal >= rightStack.peek()) {
                rightStack.pop();
            }
            if (rightStack.isEmpty()) {
                ans[index % n] = -1;
            } else {
                ans[index % n] = rightStack.peek();
            }
            rightStack.add(currentVal);
        }



        System.out.println(Arrays.toString(ans));

    }
}
