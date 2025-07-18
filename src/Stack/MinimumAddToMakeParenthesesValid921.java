package src.Stack;

//For example, if s = "()))", you can insert an opening parenthesis to be "(()))"
// or a closing parenthesis to be "())))".

import java.util.Scanner;
import java.util.Stack;

//Input: s = "((("
//Output: 3
public class MinimumAddToMakeParenthesesValid921 {
    /*
    public int minAddToMakeValid(String s){
        int open = 0;
        int close = 0;
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                if (open<=0){
                    close++;
                }
                else {
                    open--;
                }
            }
        }
        return (open +close);
    }
*/
    public int minAddToMakeValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '('){
                stack.push(ch);
            }
            else {
                if (stack.isEmpty() || stack.peek()== ')'){
                    stack.push(ch);
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.size();

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Parentheses in like '(' or ')' : ");
        String s = sc.nextLine();

        MinimumAddToMakeParenthesesValid921 ms = new MinimumAddToMakeParenthesesValid921();
      int ans =  ms.minAddToMakeValid(s);
        System.out.println("The Number of Parentheses add to make Parentheses Valid is : "+ans);
    }
}
