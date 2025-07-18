package src.Stack;

import java.util.Stack;

public class Baseball_Game_682 {
        public int calPoints(String[] operations) {
            Stack<Integer> stack = new Stack<>();

            for(String i :operations ){
                if(i.equals("+")){
                    stack.push(stack.peek()+ stack.get(stack.size()-2));
                }
                else if(i.equals("D")){
                    stack.push(2 * stack.peek());
                }
                else if(i.equals("C")){
                    stack.pop();
                }
                else{
                    stack.push(Integer.parseInt(i));
                }
            }
            int sum =0;
            for(int i : stack){
                sum += i;
            }
            return sum;
        }

    public static void main(String[] args) {
            Baseball_Game_682 bs = new Baseball_Game_682();
        String [] arr = {"5","2","C","D","+"};
      int ans=   bs.calPoints(arr);
        System.out.println("The Final answer is : "+ans);

    }

}
