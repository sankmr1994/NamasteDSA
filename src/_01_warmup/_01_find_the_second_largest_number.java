package _01_warmup;

public class _01_find_the_second_largest_number {
    public static void main(String[] args) {
        int[] arr = {4, 9, 0, 2, 8, 7, 1};
        int n = arr.length;

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int index = 0; index < n; index++) {
            int currentValue = arr[index];
            if (currentValue > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = currentValue;
            }
            if (currentValue > secondLargest && currentValue != firstLargest){
                secondLargest = currentValue;
            }
        }

        System.out.println(secondLargest);

    }
}
