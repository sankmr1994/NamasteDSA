package _02_arrays_easy_medium;

import java.util.Arrays;

public class _02_remove_element {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int n = nums.length;
        int p1 = 0;
        int p2 = 0;
        while (p2 < n) {
            if (nums[p2] == val) {
                p2++;
            } else {
                nums[p1] = nums[p2];
                p1++;
                p2++;
            }
        }

        System.out.println("After process : " + Arrays.toString(nums));
        System.out.println("Result : " + p1);
    }
}
