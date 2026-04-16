package _07_stacks_and_queues;

import java.util.HashMap;
import java.util.Stack;

public class _03_valid_parentheses {
    public static void main(String[] args) {
        String s = "[()]}";
        int n = s.length();
        HashMap<Character, Character> openingMap = new HashMap<>();
        openingMap.put('(', ')');
        openingMap.put('[', ']');
        openingMap.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < n; index++) {
            char ch = s.charAt(index);
            if (stack.isEmpty() || openingMap.containsKey(ch)) {
                stack.push(ch);
            } else if (stack.peek() != openingMap.get(stack.peek())) {
                System.out.println("Not valid");
                System.exit(0);
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("Not valid");
        }
    }
}
