package src.JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class SwapTwoNumberWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number to swap: ");
        int a = sc.nextInt();//5
        int b = sc.nextInt();//10
        System.out.println("Before Swapping a is: "+a +" and b is : "+b);
        a = a + b;
        b =  a - b;
        a = a - b;
        System.out.println("After swapping a is : "+a+" and b is : "+b );


        System.out.println("Using XOR Operator ");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap: a = " + a + ", b = " + b);

    }
}
