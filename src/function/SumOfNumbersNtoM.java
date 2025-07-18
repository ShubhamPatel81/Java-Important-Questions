package src.function;

import java.util.Scanner;

public class SumOfNumbersNtoM {

    static int hello(int n  , int m){
        int sum1 = 0;
        int sum2 =0 ;




        for (int i = 1; i<= m ; i++){
            if (i % n == 0) {
                System.out.print(i+" ");
                sum1 += i;
            }
        }

        System.out.println();
        for (int j = 1; j <= m; j++){
            if (j%n != 0){
                sum2+=j;
                System.out.print(j+" ");
            }
        }


        System.out.println("\n" +sum1 +"\n"+sum2);
        return sum2-sum1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int n = sc.nextInt();
        System.out.println("Enter number 2: ");
        int m = sc.nextInt();
        System.out.println();

      int ans =   hello(n, m);
        System.out.println("Value is :"+ans);


    }
}
