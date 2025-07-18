package src.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PostFixExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Postfix Expression with space : ");
        String str = sc.nextLine();
        int result = postFix(str);
        System.out.println("Result: " + result);
    }

    static int postFix(String postfix) {
        Stack<String> postFixVal = new Stack<>();

        for (String current : postfix.split(" ")) {
            if (isNumber(current)) {
                postFixVal.push(current);
            } else {
                int num1 = Integer.parseInt(postFixVal.pop());
                int num2 = Integer.parseInt(postFixVal.pop());

                switch (current) {
                    case "+" -> postFixVal.push(String.valueOf(num2 + num1));
                    case "-" -> postFixVal.push(String.valueOf(num2 - num1));
                    case "*" -> postFixVal.push(String.valueOf(num2 * num1));
                    case "/" -> postFixVal.push(String.valueOf(num2 / num1));
                    case "%" -> postFixVal.push(String.valueOf(num2 % num1));
                    default -> throw new IllegalArgumentException("Unsupported operator: " + current);
                }
            }
        }

        return Integer.parseInt(postFixVal.pop());
    }

    static boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
