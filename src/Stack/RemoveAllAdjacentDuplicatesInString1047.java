package src.Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0) );
        for(int i = 1 ; i< s.length(); i++){
            if(!stack.isEmpty() && s.charAt(i) == stack.peek()){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }

        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stack){
            sb.append(ch);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String  s = "abbaca";
        RemoveAllAdjacentDuplicatesInString1047 rm = new RemoveAllAdjacentDuplicatesInString1047();
      String ans =   rm.removeDuplicates(s);
        System.out.println("The answer is : "+ans );
    }
}
