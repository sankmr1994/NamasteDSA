package _03_recursion;

public class _03_sum_of_odd_number_in_array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 0, 3, 6, 7};
        int n = arr.length;
        System.out.println("Sum of ODD : " + sumOfOdd(arr, n - 1));
    }

    public static int sumOfOdd(int[] arr, int n) {
        if (n == 0) {
            return arr[0] % 2 == 1 ? arr[0] : 0;
        }
        int val = sumOfOdd(arr, n - 1);
        if (arr[n] % 2 == 1) {
            return val + arr[n];
        } else {
            return val;
        }
    }
}
