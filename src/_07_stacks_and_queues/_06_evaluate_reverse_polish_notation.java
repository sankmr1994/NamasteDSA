package _07_stacks_and_queues;

import java.util.Stack;

public class _06_evaluate_reverse_polish_notation {
    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int n = tokens.length;
        Stack<Integer> expressionStack = new Stack<>();
        for (int index = 0; index < n; index++) {
            String currentVal = tokens[index];
            int ans = 0;
            if (currentVal.equals("+")){
                int val2 = expressionStack.pop();
                int val1 = expressionStack.pop();
                ans = val1 + val2;
                expressionStack.add(ans);
            } else if (currentVal.equals("-")) {
                int val2 = expressionStack.pop();
                int val1 = expressionStack.pop();
                ans = val1 - val2;
                expressionStack.add(ans);
            }else if (currentVal.equals("*")) {
                int val2 = expressionStack.pop();
                int val1 = expressionStack.pop();
                ans = val1 * val2;
                expressionStack.add(ans);
            }else if (currentVal.equals("/")) {
                int val2 = expressionStack.pop();
                int val1 = expressionStack.pop();
                ans = val1 / val2;
                expressionStack.add(ans);
            }else {
                expressionStack.add(Integer.parseInt(currentVal));
            }
        }

        System.out.println(expressionStack.peek());

    }
}
