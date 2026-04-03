package _06_strings;

public class _08_largest_odd_number_in_string {
    public static void main(String[] args) {
        String num = "1238";
        int n = num.length();
        int index = n - 1;
        while (index >= 0) {
            int val = num.charAt(index);
            if (val % 2 == 1) {
                System.out.println(num.substring(0, index + 1));
                System.exit(0);
            }
            index--;
        }
        System.out.println("");
    }
}
