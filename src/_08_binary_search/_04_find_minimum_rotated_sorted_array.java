package _08_binary_search;

public class _04_find_minimum_rotated_sorted_array {
    public static void main(String[] args) {
        int[] nums = {5, 1, 2, 3, 4};
        int n = nums.length;
        if (nums[0] <= nums[n - 1]) {
            System.out.println(nums[0]);
            System.exit(0);
        }
        if (nums[0] > nums[1]) {
            System.out.println(nums[1]);
            System.exit(0);
        }
        if (nums[n - 2] > nums[n - 1]) {
            System.out.println(nums[n - 1]);
            System.exit(0);
        }
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid - 1] > nums[mid]) {
                System.out.println(nums[mid]);
                System.exit(0);
            }
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
