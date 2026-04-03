package _06_strings;

import java.util.ArrayList;
import java.util.HashMap;

public class _12_group_anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        int n = strs.length;
        boolean[] markedAnagram = new boolean[n];
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for (int index = 0; index < n; index++) {
            if (!markedAnagram[index]) {
                markedAnagram[index] = true;
                String currentStr = strs[index];
                ArrayList<String> currentList = new ArrayList<>();
                currentList.add(currentStr);
                for (int j = 0; j < n; j++) {
                    if (index != j && !markedAnagram[j]) {
                        String compareStr = strs[j];
                        if (isAnagarm(currentStr, compareStr)) {
                            currentList.add(compareStr);
                            markedAnagram[j] = true;
                        }
                    }
                }
                ans.add(currentList);
            }
        }

        System.out.println(ans);
    }

    private static boolean isAnagarm(String currentStr, String compareStr) {
        int n = currentStr.length();
        int m = compareStr.length();

        if (n != m) {
            return false;
        }

        HashMap<Character, Integer> sFreq = new HashMap<>();
        HashMap<Character, Integer> tFreq = new HashMap<>();

        for (int index = 0; index < n; index++) {
            sFreq.put(currentStr.charAt(index), sFreq.getOrDefault(currentStr.charAt(index), 0) + 1);
            tFreq.put(compareStr.charAt(index), tFreq.getOrDefault(compareStr.charAt(index), 0) + 1);
        }

        if (sFreq.size() != tFreq.size()) {
            System.out.println("Not anagram");
            return false;
        }

        for (char sCh : sFreq.keySet()) {
            int sF = sFreq.getOrDefault(sCh, 0);
            int tF = tFreq.getOrDefault(sCh, 0);
            if (sF != tF) {
                return false;
            }
        }
        return true;

    }
}
