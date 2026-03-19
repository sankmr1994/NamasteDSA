package _04_searching_and_sorting;

import java.util.Arrays;

public class _06_merge_sort {
    public static void main(String[] args) {
        int[] nums = {8, -6, 0, 1, 2, -1, 5, 44, -10};
        int n = nums.length;
        int[] sortedArr = mergeSort(nums, 0, n - 1);
        System.out.println("After sort : " + Arrays.toString(sortedArr));
    }

    public static int[] mergeSort(int[] nums, int low, int high) {
        if (low == high) {
            return new int[]{nums[low]};
        }
        int mid = (high - low) / 2 + low;
        int[] leftSortedArr = mergeSort(nums, low, mid);
        int[] rightSortedArr = mergeSort(nums, mid + 1, high);
        return merge(leftSortedArr, rightSortedArr);
    }

    public static int[] merge(int[] leftSortedArr, int[] rightSortedArr) {
        int n = leftSortedArr.length;
        int m = rightSortedArr.length;
        int i, j, k;
        i = j = k = 0;
        int[] sortedArr = new int[n + m];
        while (i < n && j < m) {
            sortedArr[k++] = leftSortedArr[i] <= rightSortedArr[j] ? leftSortedArr[i++] : rightSortedArr[j++];
        }

        while (i < n){
            sortedArr[k++] = leftSortedArr[i++];
        }

        while (j < m){
            sortedArr[k++] = rightSortedArr[j++];
        }

        return sortedArr;
    }
}
