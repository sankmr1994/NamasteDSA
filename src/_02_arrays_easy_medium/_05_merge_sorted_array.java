package _02_arrays_easy_medium;

import java.util.Arrays;

public class _05_merge_sorted_array {
    public static void main(String[] args) {
        int[] nums1 = {2, 0, 0, 0};
        int m = 1;
        int[] nums2 = {-5, 1, 2};
        int n = 3;
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = nums1.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }

        while (p2 >= 0) {
            nums1[p2] = nums2[p2];
            p2--;
        }

        System.out.println("Ans : " + Arrays.toString(nums1));
    }
}
