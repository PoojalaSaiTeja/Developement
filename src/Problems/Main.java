package Problems;

import java.io.IOException;
import java.util.Stack;

public class Main {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();


        for (String token : tokens) {
            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] expression = {"5", "1", "2", "+", "4", "*", "+", "3", "-"};
        int result = evaluateRPN(expression);
        System.out.println("The result of the RPN expression is: " + result);
    }
}
