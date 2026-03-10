package _02_arrays_easy_medium;

public class _08_missing_number {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int val : nums) {
            arrSum = arrSum + val;
        }
        System.out.println("Ans : " + (totalSum - arrSum));
    }
}
