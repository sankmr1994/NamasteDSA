package _06_strings;

import java.util.HashMap;

public class _03_jewels_and_stones {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZZZ";

        HashMap<Character, Integer> stonesFreq = new HashMap<>();
        int n = stones.length();

        for (int index = 0; index < n; index++) {
            char ch = stones.charAt(index);
            stonesFreq.put(ch, stonesFreq.getOrDefault(ch, 0) + 1);
        }

        n = jewels.length();
        int count = 0;

        for (int index = 0; index < n; index++) {
            char ch = jewels.charAt(index);
            if (stonesFreq.containsKey(ch)) {
                count = count + stonesFreq.get(ch);
            }
        }

        System.out.println("Ans : " + count);
    }
}
