package src.function;

import java.util.Scanner;

public class EvenOrOdd {

     static int helo(int a){
        if ((a &1)==1){
            return 1;
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n = sc.nextInt();
         int ans =  helo(n);
         if (ans == 1){
             System.out.println("This is odd number ");
         }else {
             System.out.println("This is even number");
         }

    }
}
