package _08_binary_search;

public class _06_peak_index_in_mountain_array {
    public static void main(String[] args) {
        int[] nums = {3,5,3,2,0};
        int n = nums.length;

        int low = 1;
        int high = n - 2;
        int ans = -1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                ans = mid;
                break;
            } else if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
