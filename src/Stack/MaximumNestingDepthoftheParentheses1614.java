package src.Stack;

public class MaximumNestingDepthoftheParentheses1614 {
    public int maxDepth(String s) {
        int count = 0;
        int maxNum = 0 ;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
                if(maxNum < count){
                    maxNum = count;
                }
            }
            else if(c ==')'){
                count--;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        MaximumNestingDepthoftheParentheses1614 mx = new MaximumNestingDepthoftheParentheses1614();
        String s = "(1+(2*3)+((8)/4))+1";
     int ans =   mx.maxDepth(s);
        System.out.println("The Final answer is : "+ans);
    }
}