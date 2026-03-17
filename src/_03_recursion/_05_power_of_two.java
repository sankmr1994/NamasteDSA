package _03_recursion;

public class _05_power_of_two {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Is power of 2 : " + isPowerOf2(n, 1));
    }

    public static boolean isPowerOf2(int n, int pow) {
        if (n == 1 || pow == n) {
            return true;
        }
        if (pow > n / 2) {
            return false;
        }

        return isPowerOf2(n, pow * 2);
    }
}
