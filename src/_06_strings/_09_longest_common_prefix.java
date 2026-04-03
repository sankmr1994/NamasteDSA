package _06_strings;

public class _09_longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        int n = strs.length;
        System.out.println("flow".indexOf("flower"));

        int minLengthIndex = -1;
        int minLength = Integer.MAX_VALUE;
        for (int index = 0; index < n; index++) {
            int currentStrLength = strs[index].length();
            if (currentStrLength < minLength) {
                minLength = currentStrLength;
                minLengthIndex = index;
            }
        }

        String minStr = strs[minLengthIndex];
        for (int index = 0; index < minLength; index++) {
            char ch = minStr.charAt(index);
            int j = 0;
            while (j < n) {
                if (ch != strs[j].charAt(index)) {
                    System.out.println(minStr.substring(0, index));
                    System.exit(0);
                }
                j++;
            }
        }

        System.out.println("Ans : " + minStr);

    }
}
