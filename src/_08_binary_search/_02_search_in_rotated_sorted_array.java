package _08_binary_search;

public class _02_search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] nums = {3,1};
        int n = nums.length;
        int target = 1;

        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == target) {
                System.out.println(nums[mid]);
                System.exit(0);
            }
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println(-1);
    }
}
