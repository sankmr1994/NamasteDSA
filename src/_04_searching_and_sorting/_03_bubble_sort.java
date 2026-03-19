package _04_searching_and_sorting;

import java.util.Arrays;

public class _03_bubble_sort {
    public static void main(String[] args) {
        int[] arr = {8, -6, 0, 1, 2, -1, 5, 44, -10};
        int n = arr.length;
        boolean swap = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

        System.out.println("After sort : " + Arrays.toString(arr));
    }
}
