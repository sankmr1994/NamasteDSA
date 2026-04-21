package _08_binary_search;

public class _07_single_element_sorted_array {
    public static void main(String[] args) {
        int[] nums = {3, 3, 7, 7, 10, 11, 11};
        int n = nums.length;
        if (n == 1 || nums[0] != nums[1]) {
            System.out.println(nums[0]);
            System.exit(0);
        }
        if (nums[n - 1] != nums[n - 2]) {
            System.out.println(nums[n - 1]);
            System.exit(0);
        }
        int low = 1;
        int high = n - 2;
        int ans = -1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                ans = nums[mid];
                break;
            } else if ((nums[mid] == nums[mid + 1] && mid % 2 == 0) || (nums[mid] == nums[mid - 1] && mid  % 2 == 1)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
