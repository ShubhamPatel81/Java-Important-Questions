package src.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class LongestValidParentheses_num {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        removeValidParenthesis(s, stack);
        if(stack.isEmpty()){
            return s.length();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        fromArrayOfInvalidIndexes(arr, stack,s);
        int max = 0;
        for(int i = 1; i<arr.size();i++){
            int prev= arr.get(i-1);
            max =Math.max(max,arr.get(i) - prev-1);
        }
        return max;
    }
    public static void removeValidParenthesis(String s, Stack<Integer> stack){
        for(int i = 0 ; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }
            else{
                if(stack.isEmpty() || s.charAt(stack.peek()) == ')'){
                    stack.push(i);
                }else{
                    stack.pop();
                }
            }
        }
    }
    public static void fromArrayOfInvalidIndexes(ArrayList<Integer> arr, Stack<Integer> stack,String s){
        arr.add(0,s.length());
        while(!stack.isEmpty()){
            arr.add(0,stack.pop());
        }
        arr.add(0,-1);
    }

    public static int longestValidParentheses_Sort_Way(String s) {
        Stack<Integer> stack = new Stack<>();

        int max = 0;
        stack.push(-1);
        for(int i = 0 ; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                max = Math.max(max, i-stack.peek());
            }
        }
        return max;

    }

    public static void main(String[] args) {
        String s = "(()()))(())()()(";
        int ans = longestValidParentheses(s);
        int ans1 = longestValidParentheses_Sort_Way(s);
        System.out.println("Using both the method ans is : "+ ans +" and "+ ans1);

    }

}

