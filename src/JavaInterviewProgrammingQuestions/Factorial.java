package src.JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fabonacciNumber(n);
        System.out.println("Factorial is : "+res);

    }

    public static int fabonacciNumber(int n){
        if (n <= 1 ||n<=0)return 1;
        int ans = n* fabonacciNumber(n-1);
        return ans;
    }
}
