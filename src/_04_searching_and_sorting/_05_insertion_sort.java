package _04_searching_and_sorting;

import java.util.Arrays;

public class _05_insertion_sort {
    public static void main(String[] args) {
        int[] arr = {8, -6, 0, 1, 2, -1, 5, 44, -10};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int currentVal = arr[i];
            int j = i - 1;
            for (; j >= 0 && currentVal <= arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = currentVal;
        }
        System.out.println("After sort : " + Arrays.toString(arr));

    }
}
