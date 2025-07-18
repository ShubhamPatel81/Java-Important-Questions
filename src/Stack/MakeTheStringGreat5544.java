package src.Stack;

import java.util.Stack;

public class MakeTheStringGreat5544 {

    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (!stack.isEmpty() && Math.abs(stack.peek() - a) == 32) {
                stack.pop(); // Remove the pair if it forms a good string
            } else {
                stack.push(a); // Push the character otherwise
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString(); // Reverse the result to get the correct order
    }

    public static void main(String[] args) {
        MakeTheStringGreat5544 mk = new MakeTheStringGreat5544();
        String s = "leEeetcode";
         String res =    mk.makeGood(s);
        System.out.println("The Final answer is: "+ res);


    }


}

