package src.function;

import java.util.Scanner;

public class problem1 {


    public Long power(Long n, Long m){

        return (long) Math.pow(n,m);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        problem1 p = new problem1();

        System.out.println("Enter number 1: ");
        long n = sc.nextLong();
        System.out.println("Enter number 2 : ");
        long m = sc.nextLong();
         long ans = p.power(n,m);
        System.out.println("Power of two number is : "+ans);

    }
}
