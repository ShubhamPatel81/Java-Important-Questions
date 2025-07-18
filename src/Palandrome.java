package src;

import java.util.Scanner;

public class Palandrome {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        int original = num;
//        int reverse = 0;
//
//        while (num>0){
//            int digit = num%10;
//            reverse = reverse* 10+digit;
//            num = num/10;
//        }
//        System.out.println(original == reverse);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int origial = num;
        int rev = 0;
        int rem = 0;

        while (num>0){
            rem = num%10;
            num = num/10;
            rev = rev*10;
            rev = rev+rem;


        }
        System.out.println(origial == rev);
    }
}
