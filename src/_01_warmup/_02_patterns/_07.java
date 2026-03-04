package _01_warmup._02_patterns;

public class _07 {
    public static void main(String[] args) {
        int n = 5;
        for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print(col % 2 == 1 ? "1" : "0");
            }
            System.out.println();
        }
    }
}
