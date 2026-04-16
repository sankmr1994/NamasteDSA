package _07_stacks_and_queues;

import java.util.Stack;

public class _05_remove_outermost_parentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int depth = 0;
        int index = 0;
        while (index < n) {
            char ch = s.charAt(index);
            if (ch == '(') {
                if (depth > 0){
                    ans.append(ch);
                }
                depth++;
            } else  {
                depth--;
                if (depth > 0){
                    ans.append(ch);
                }
            }
            index++;
        }
        System.out.println(ans.toString());
    }
}
