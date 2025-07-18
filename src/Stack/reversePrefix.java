package src.Stack;

import java.util.Stack;

public class reversePrefix {
    public String reversePrefix(String word, char ch) {
        Stack <Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean found  = false;

        for(int i = 0 ; i< word.length(); i++){
            char  currentChar = word.charAt(i);
            stack.push(currentChar);
            if(currentChar == ch){
                found = true;
                break;
            }
        }
        if(found){
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
            for(int i = sb.length() ; i < word.length(); i++){
                sb.append(word.charAt(i));
            }
        }
        else{
            return word;
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        reversePrefix ans = new reversePrefix();
        System.out.println(ans.reversePrefix("abcdfdh", 'd'));
        System.out.println(ans.reversePrefix("abcd", 'z'));
    }
}
