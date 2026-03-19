package _04_searching_and_sorting;

public class _02_binary_search {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 91;
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == target) {
                ans = mid;
                break;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Ans : " + ans);
    }
}
