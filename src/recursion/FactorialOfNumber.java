package src.recursion;

import java.util.Scanner;

public class FactorialOfNumber {

    static int factorial(int a ){
        if(a ==1|| a == 2||a==0){
//            System.out.println(a);
            return  a;
        }
        return a * factorial(a-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
       int ans = factorial(a);
        System.out.println( "Factorial is  : "+ans);
    }
}
