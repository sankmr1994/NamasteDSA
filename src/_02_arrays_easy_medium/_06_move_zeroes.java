package _02_arrays_easy_medium;

import java.util.Arrays;

public class _06_move_zeroes {
    public static void main(String[] args) {
        int[] nums = {1};
        int n = nums.length;
        int p1 = 0;
        int p2 = 0;

        while (p2 < n) {
            if (nums[p2] == 0) {
                p2++;
            } else {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2++;
            }
        }

        System.out.println("After moves : " + Arrays.toString(nums));
    }
}
