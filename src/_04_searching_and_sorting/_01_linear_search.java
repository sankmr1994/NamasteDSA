package _04_searching_and_sorting;

public class _01_linear_search {
    public static void main(String[] args) {
        int[] arr = {8, -1, 10, 5};
        int n = arr.length;
        int target = 101;
        for (int index = 0; index < n; index++) {
            if (arr[index] == target) {
                System.out.println("Ans : " + index);
                System.exit(0);
            }
        }
        System.out.println("Ans : " + -1);
    }
}
