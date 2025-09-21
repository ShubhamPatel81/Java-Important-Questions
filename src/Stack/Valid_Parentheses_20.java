package src.Stack;

import java.util.Stack;

public class Valid_Parentheses_20 {
    public boolean isValid(String s) {
        Stack <Character> stack = new  Stack();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' ||  c == '{'){
                stack.add(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if( c == ']' && stack.peek()!='['){
                    return false;
                }
                if( c == '}' && stack.peek()!='{'){
                    return false;
                }
                if( c == ')' && stack.peek()!='('){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String  s2 = "(]";
        Valid_Parentheses_20 vp = new Valid_Parentheses_20();
        System.out.println("Valid Parenthesis are: ");
        System.out.println("For String s1: "+ vp.isValid(s1));
        System.out.println("For String s2 : "+vp.isValid(s2));

    }
}
