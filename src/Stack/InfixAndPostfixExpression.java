package src.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class InfixAndPostfixExpression {
    public static void main(String[] args) {
        System.out.println("Enter the expression : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(infixToPostfix(str));
    }

    static String infixToPostfix(String infix) {
        Stack<String> operators = new Stack<>();
        List<String> postfix = new ArrayList<>();

        for (String current : infix.split(" ")) {
            if (isOp(current)) {
                while (!operators.empty() && isLowerPrecedence(current, operators.peek())) {
                    postfix.add(operators.pop());
                }
                operators.push(current);
            } else {
                postfix.add(current);
            }
        }
        while (!operators.empty()) {
            postfix.add(operators.pop());
        }
        return String.join(" ", postfix);
    }

    static boolean isOp(String op) {
        return List.of("+", "-", "*", "/", "%").contains(op);
    }

    static int precedence(String op) {
        return switch (op) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            case "%" -> 3;
            default -> 4;
        };
    }
    static boolean isLowerPrecedence(String op1, String op2) {
        if (precedence(op1) < precedence(op2)) {
            return true;
        } else {
            return false;
        }
    }
}