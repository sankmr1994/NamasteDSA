package _08_binary_search;

public class _05_find_first_and_last_position_element_sorted_array {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 8, 8, 10};
        int target = 8;
        int n = nums.length;

        if (n == 0) {
            System.out.println(new int[]{-1, -1});
            System.exit(0);
        }

        int leftMost = -1;
        int rightMost = -1;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == target) {
                leftMost = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == target) {
                rightMost = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(leftMost + " " + rightMost);
    }
}
