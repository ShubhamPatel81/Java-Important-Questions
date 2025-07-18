package src.Stack;

import java.util.Stack;

public class Remove_Outermost_Parentheses_1021 {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(st.size()> 0){
                    sb.append(ch);
                }
                st.push(ch);
            }
            else{
                st.pop();
                if(st.size()> 0){
                    sb.append(ch);
                }
            }
        }
        return   sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        Remove_Outermost_Parentheses_1021 rm = new Remove_Outermost_Parentheses_1021();
       String ans = rm.removeOuterParentheses(s);
        System.out.println("The result is : "+ ans);
    }
}
