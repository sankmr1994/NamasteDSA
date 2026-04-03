package _06_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _12_group_anagrams_approach_2 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, List<String>> freqMap = new HashMap<>();
        for (String str : strs) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String sortedStr = new String(chArr);
            freqMap.putIfAbsent(sortedStr, new ArrayList<>());
            freqMap.get(sortedStr).add(str);
        }

        List<List<String>> ans = new ArrayList<>(freqMap.values());
        System.out.println(ans);
    }

}
