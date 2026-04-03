package _06_strings;

import java.util.HashMap;

public class _04_find_most_frequent_vowel_and_consonant {
    public static void main(String[] args) {
        String s = "aeiaeia";
        HashMap<Character, Integer> vowelsMap = new HashMap<>();
        HashMap<Character, Integer> constantsMap = new HashMap<>();

        int n = s.length();

        for (int index = 0; index < n; index++) {
            char ch = s.charAt(index);
            if (isVowel(ch)) {
                vowelsMap.put(ch, vowelsMap.getOrDefault(ch, 0) + 1);
            } else {
                constantsMap.put(ch, constantsMap.getOrDefault(ch, 0) + 1);
            }
        }
        int vowelMax = 0;
        int constantMax = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (isVowel(ch)) {
                vowelMax = Math.max(vowelMax, vowelsMap.getOrDefault(ch, 0));
            } else {
                constantMax = Math.max(constantMax, constantsMap.getOrDefault(ch, 0));
            }
        }

        System.out.println("Ans : " + (vowelMax + constantMax));
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
