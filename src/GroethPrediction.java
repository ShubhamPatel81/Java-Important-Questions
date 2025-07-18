package src;

import java.util.Scanner;

public class GroethPrediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        int ans = predicion(n);
        System.out.println("Prediction is : " + ans);


        System.out.println("Without using Recursion : ");
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
           int  c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
    public  static int predicion(int n){

        if (n == 0) return 0;
        if (n == 1) return 1;

        return predicion(n-1)+predicion(n-2);

    }
}
