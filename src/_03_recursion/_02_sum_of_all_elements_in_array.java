package _03_recursion;

public class _02_sum_of_all_elements_in_array {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 0, 1};
        int n = arr.length;
        System.out.println("Sum of array : " + sumOfArray(arr, n - 1));
    }

    public static int sumOfArray(int[] arr, int n) {
        if (n < 0) {
            return 0;
        }
        return arr[n] + sumOfArray(arr, n - 1);
    }
}
