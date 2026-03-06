package _02_arrays_easy_medium;

import java.util.Arrays;

public class _01_removes_duplicates_from_sorted_array {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = nums.length;

        int p1 = 0;
        int p2 = 0;

        while (p2 < n) {
            if (nums[p1] == nums[p2]) {
                p2++;
            } else {
                p1++;
                nums[p1] = nums[p2];
                p2++;
            }
        }

        System.out.println("After remove duplicates : " + Arrays.toString(nums));
        System.out.println("Unique elements : " + (p1 + 1));
    }
}
