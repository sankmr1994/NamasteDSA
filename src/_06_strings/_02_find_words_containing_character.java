package _06_strings;

import java.util.ArrayList;

public class _02_find_words_containing_character {
    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';
        int n = words.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < n; index++) {
            if (containsX(words[index], x)) {
                ans.add(index);
            }
        }

        System.out.println(ans);
    }

    private static boolean containsX(String word, char x) {
        int n = word.length();
        for (int index = 0; index < n; index++){
            char ch = word.charAt(index);
            if (ch == x){
                return true;
            }
        }
        return false;
    }
}
