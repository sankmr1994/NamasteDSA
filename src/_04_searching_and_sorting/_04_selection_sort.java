package _04_searching_and_sorting;

import java.util.Arrays;

public class _04_selection_sort {
    public static void main(String[] args) {
        int[] arr = {8, -6, 0, 1, 2, -1, 5, 44, -10};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int largestIndex = 0;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[largestIndex]) {
                    largestIndex = j;
                }
            }
            int temp = arr[n - i - 1];
            arr[n - i - 1] = arr[largestIndex];
            arr[largestIndex] = temp;
        }

        System.out.println("after sort : " + Arrays.toString(arr));
    }
}
