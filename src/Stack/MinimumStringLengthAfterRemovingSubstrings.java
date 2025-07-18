package src.Stack;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i  =0 ; i< s.length(); i++){
            char currChar = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(currChar);
                continue;
            }
            else if(currChar == 'B' && stack.peek() == 'A' ){
                stack.pop();

            }
            else if(currChar == 'D' && stack.peek() == 'C'){
                stack.pop();
            }
            else{
                stack.push(currChar);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        String s = "ABFCACDB";
        MinimumStringLengthAfterRemovingSubstrings ms = new MinimumStringLengthAfterRemovingSubstrings();
      int ans =  ms.minLength(s);
        System.out.println("The Final answer is : "+ ans);
    }
}
