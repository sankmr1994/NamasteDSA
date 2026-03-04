package _01_warmup._02_patterns;

public class _08 {
    public static void main(String[] args) {
        int n = 5;
        int toggle = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(toggle);
                toggle = toggle == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }
}
