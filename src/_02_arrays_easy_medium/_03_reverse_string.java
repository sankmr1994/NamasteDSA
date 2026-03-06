package _02_arrays_easy_medium;

public class _03_reverse_string {
    public static void main(String[] args) {
        String str = "sandykmr";
        char[] charArr = str.toCharArray();
        int n = str.length();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : charArr){
            ans.append(ch);
        }
        System.out.println("After reverse : " + ans);
    }
}
