package _06_strings;

public class _07_valid_palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int n = s.length();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            while (start < end && !isAlphaNum(s.charAt(start))) {
                start++;
            }
            while (start < end && !isAlphaNum(s.charAt(end))){
                end--;
            }
            char startCh = s.charAt(start);
            char endCh = s.charAt(end);
            if(startCh >= 'A' && startCh <= 'Z'){
                startCh = (char) (startCh ^ 32);
            }
            if(endCh >= 'A' && endCh <= 'Z'){
                endCh = (char) (endCh ^ 32);
            }
            if (startCh != endCh){
                System.out.println("Not Palindrome");
                System.exit(0);
            }
            start++;
            end--;
        }

        System.out.println("Palindrome");


    }

    private static boolean isAlphaNum(char ch) {
        return (ch >= 48 && ch <= 57) || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}
