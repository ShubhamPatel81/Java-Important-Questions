package src;

import java.util.Scanner;

public class SumOfMultipleNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the number second: ");
        int num2 = sc.nextInt();


        for ( int  i  = num1; i <=num2 ; i++){

            for (int j = 1 ; j<=10 ; j++){
                System.out.print(i*j +" ");
            }
            System.out.println();
        }





        int sum = 0;
        for (int i =1 ; i<= 10 ; i++){
            int multile = num1 * i;
            System.out.print(multile +" ");
            sum+=multile;

        }
        System.out.println("\nSum is : "+sum);
    }
}

