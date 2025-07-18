package src.questions_1;

import java.util.Map;
import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println("Enter the number to get the power of the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the power");
        int pow = sc.nextInt();

        long res = power(num, pow);
        System.out.println(num+" Power "+ pow + " is : "+res);

        System.out.print("Using For Loop: ");
        System.out.print(powerUsingForLoop(num, pow));
        System.out.println();

        System.out.println("Using Recursion: " +usingRecursion(num, pow));

    }
    static long power(int num, int pow){
        if (num ==0 || num == 1 || pow==0) return 1;
        long ans = (long) Math.pow(num, pow);
        return  ans;
    }

    static long powerUsingForLoop(int num , int pow){
        if (num ==0 || num == 1 || pow==0) return 1;
        long ans=1;
        for (int i = 0; i < pow; i++){
            ans *= num;
        }
        return ans;
    }

    static  long usingRecursion(int num , int pow){
        if (num ==0 || num == 1 || pow==0) return 1;
        long ans=  num * usingRecursion(num,pow-1);
        return ans;
    }


}
