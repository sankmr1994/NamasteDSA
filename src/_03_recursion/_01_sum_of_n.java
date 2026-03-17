package _03_recursion;

public class _01_sum_of_n {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of n : "+ sumOfN(n));
    }
    public static int sumOfN(int n){
        if (n == 1){
            return 1;
        }
        return sumOfN(n - 1) + n;
    }
}
