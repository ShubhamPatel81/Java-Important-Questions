package src.Stack;

import java.util.Stack;

public class Maximal_Rectangle {
    public static int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return  0;
        int heights[] = new int [matrix[0].length];
        int largest = 0;
        for(int i = 0; i < matrix.length ; i++){
            for(int j= 0; j <matrix[i].length; j++){
                int val = matrix[i][j] -'0';
                if(val == 0 ){
                    heights[j]=0;
                }else{
                    heights[j]+= val;
                }
            }
            int maxArea = largestRectangle(heights);
            if(largest < maxArea ){
                largest = maxArea;
            }
        }
        return largest;
    }

    public static int largestRectangle(int [] height){
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= n; i++){
            int element = (i== n)?0:height[i];
            while(!stack.isEmpty() && height[stack.peek()]>element){
                int h= height[stack.pop()];
                int ps = (stack.isEmpty())?-1:stack.peek();
                int w = i - ps -1;
                max = Math.max(max,(h*w));
            }
            stack.push(i);
        }
        return (max == Integer.MIN_VALUE)?0:max;
    }

    public static void main(String[] args) {
        char[][] matrix ={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int ans = maximalRectangle(matrix);
        System.out.println("Minimal Area of rectangle is: "+ans);

    }
}
