package _06_strings;

public class _01_length_of_last_word {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        int n = s.length();
        int count = 0;
        int index = n - 1;
        while (index >= 0) {
            int currentCh = s.charAt(index);
            if (currentCh == ' ' && count > 0) {
                break;
            }
            if (currentCh != ' ') {
                count++;
            }
            index--;
        }

        System.out.println("Count : " + count);
    }
}
