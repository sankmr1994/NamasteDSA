package _07_stacks_and_queues;

import java.util.Arrays;
import java.util.Stack;

public class _07_next_greater_element {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int[] nextGreaterRight = new int[10001];
        Stack<Integer> nextGreaterStack = new Stack<>();
        for (int index = nums2Len - 1; index >= 0; index--) {
            int currentVal = nums2[index];

            while (!nextGreaterStack.isEmpty() && currentVal >= nextGreaterStack.peek()) {
                nextGreaterStack.pop();
            }

            if (nextGreaterStack.isEmpty()) {
                nextGreaterRight[nums2[index]] = -1;
            } else {
                nextGreaterRight[nums2[index]] = nextGreaterStack.peek();
            }

            nextGreaterStack.add(currentVal);
        }

        System.out.println(Arrays.toString(nextGreaterRight));

        int[] ans = new int[nums1Len];

        for (int index = 0; index < nums1Len; index++) {
            int val = nums1[index];
            ans[index] = nextGreaterRight[val];
        }

        System.out.println(Arrays.toString(ans));
    }
}
