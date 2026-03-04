package _01_warmup;

public class _04_palindrom {
    public static void main(String[] args) {
        int n = 121;
        boolean isPalindrom = isPalindrom(n);
        System.out.println("Is palindrom : " + isPalindrom);
    }
    public static boolean isPalindrom(int n){
        int reverse = 0;
        int backup = n;
        while (n != 0){
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        return reverse == backup;
    }
}
