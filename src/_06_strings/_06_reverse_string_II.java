package _06_strings;

public class _06_reverse_string_II {
    public static void main(String[] args) {
        String s = "krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc";
        char[] chArr = s.toCharArray();
        int k = 20;
        int n = s.length();
        System.out.println("length : " + n);
        int start = 0;
//        reverseK(chArr, k, start, n);

        while (start < n){
            int end = Math.min(start + k -1, n - 1);
            reverse(chArr,start,end);
            start = start + (2 * k);
        }

        System.out.println(String.valueOf(chArr));

    }

    private static void reverseK(char[] chArr, int k, int start, int length) {
        if (length < k) {
            reverse(chArr, start, start + length - 1);
            return;
        }
        if (length < k * 2) {
            reverse(chArr, start, start + k - 1);
            return;
        }
        reverseK(chArr, k, start + 2 * k, length - 2 * k);
        reverse(chArr, start, start + k - 1);
    }

    public static void reverse(char[] chArr, int strat, int end) {
        while (strat < end) {
            char temp = chArr[strat];
            chArr[strat] = chArr[end];
            chArr[end] = temp;
            strat++;
            end--;
        }
    }
}
