package src.JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        if (n <0 ) System.out.println("Enter Positive Number");
        if (n == 1) System.out.println("Fabonacci number upto 1 is 1");
        System.out.println("Fabonacci NUmber is ");
        int fist = 0;
        int second = 1;
        System.out.print(fist+" "+second);
        for (int i = 2; i <n ; i++){
            int next = fist +second;
            System.out.print(" "+next);
            fist = second;
            second =next;
        }
        System.out.println();
        System.out.println("Using recursive approach: ");
        for (int i = 0; i< n ; i++){
            System.out.print(fabonacci(i)+" ");
        }
        System.out.println();
    }
    public static int fabonacci(int n){
        if (n <=1) return  n;
        return fabonacci(n-1)+fabonacci(n-2);
    }
}
