package src;

import java.util.Scanner;

public class DepositeAmount {
    public static void main(String[] args) {
        System.out.println("Enter Number of days : ");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = allMoney(n);
        System.out.println("\nTotal deposit amount is : "+ ans);


    }
    public static int allMoney(int n){

        int total  = 0;

        for (int i = 1; i <= n ; i++){
            System.out.print(i+" ");
                total += i ;
        }


        return total;

    }
}
