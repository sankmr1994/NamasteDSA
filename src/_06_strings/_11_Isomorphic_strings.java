package _06_strings;

import java.util.HashMap;
import java.util.Objects;

public class _11_Isomorphic_strings {
    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t = "aaabbbba";
        int sLen = s.length();
        int tLen = t.length();

        if (sLen != tLen) {
            System.out.println("Isomorphic");
            System.exit(0);
        }

        HashMap<Character, Integer> sMapIndex = new HashMap<>();
        HashMap<Character, Integer> tMapIndex = new HashMap<>();
        for (int index = 0; index < sLen; index++) {
            char sCh = s.charAt(index);
            char tCh = t.charAt(index);
            if (!Objects.equals(sMapIndex.get(sCh), tMapIndex.get(tCh))) {
                System.out.println("Isomorphic");
                System.exit(0);
            }
            sMapIndex.put(sCh, index + 1);
            tMapIndex.put(tCh, index + 1);
        }

        System.out.println("Isomorphic");
    }
}
