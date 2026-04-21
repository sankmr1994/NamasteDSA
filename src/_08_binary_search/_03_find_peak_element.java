package _08_binary_search;

public class _03_find_peak_element {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int n = nums.length;
        if (n == 1 || nums[0] > nums[1]) {
            System.out.println(0);
            System.exit(0);
        }

        if (nums[n - 1] > nums[n - 2]) {
            System.out.println(n - 1);
            System.exit(0);
        }
        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                System.out.println(mid);
                System.exit(0);
            } else if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(-1);

    }
}
