package src;

import java.util.Scanner;

//to find permutation nCr --> n!/(n-r)!*r!
public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the r :");
        int r = sc.nextInt();

        if (r>n) {
            System.out.println("r cannot be grate then n");
            return;

        }
        long nf= factorial(n);
        long rf = factorial(r);
        long n_r = factorial(n-r);
        long ans = nf/(rf* n_r);
        System.out.println("Answer is : "+ans);


    }
    public  static long factorial(int n ){
        int res = 1;
        if (n==0|| n==1) return 1;
        for (int i =1 ; i <= n; i++){
            res = res*i;
        }
        return res;
//        return n * factorial(n-1);
    }
}
