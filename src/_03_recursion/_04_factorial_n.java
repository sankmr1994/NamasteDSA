package _03_recursion;

public class _04_factorial_n {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of n : " + factOfN(n));
    }

    public static int factOfN(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factOfN(n - 1);
    }
}
