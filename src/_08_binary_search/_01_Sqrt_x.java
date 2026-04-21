package _08_binary_search;

public class _01_Sqrt_x {
    public static void main(String[] args) {
        int x = 1;
        if (x == 0) {
            System.out.println(0);
            System.exit(0);
        }
        int low = 1;
        int high = x / 2;
        int ans = 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            long power = (long) mid * mid;
            if (power == x) {
                System.out.println(mid);
                System.exit(0);
            }
            if (power < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
