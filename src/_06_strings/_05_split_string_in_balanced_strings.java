package _06_strings;

public class _05_split_string_in_balanced_strings {
    public static void main(String[] args) {
        String s = "LLLLRRRR";
        int n = s.length();

        int rCount = 0;
        int lCount = 0;
        int count = 0;
        for (int index = 0; index < n; index++) {
            char ch = s.charAt(index);
            if (ch == 'R') {
                rCount++;
            }
            if (ch == 'L') {
                lCount++;
            }
            if (rCount == lCount) {
                count++;
            }
        }

        System.out.println("Ans : " + count);
    }
}
