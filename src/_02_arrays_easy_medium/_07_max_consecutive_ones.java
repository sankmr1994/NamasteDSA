package _02_arrays_easy_medium;

public class _07_max_consecutive_ones {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 1, 0, 1};
        int n = nums.length;
        int maxCount = 0;
        int onesCount = 0;
        for (int index = 0; index < n; index++) {
            if (nums[index] == 1) {
                onesCount++;
            } else {
                maxCount = Math.max(onesCount, maxCount);
                onesCount = 0;
            }
        }
        maxCount = Math.max(onesCount, maxCount);
        System.out.println("Max count : " + maxCount);
    }
}
