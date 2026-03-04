package _01_warmup;

public class _03_count_digits {
    public static void main(String[] args) {
        int n = 123;
        int count = countDigits(n);
        System.out.println(count);
    }
    public static int countDigits(int n){
        int count = 0;
        while (n != 0){
            count++;
            n = n / 10;
        }
        return count;
    }
}
