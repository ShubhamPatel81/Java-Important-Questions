package src.questions_1;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oroginal =num;
//        121

        int rev = 0;
        while (num>0){
             int digit  = num%10;
             rev = 10* rev +digit;
            num = num/10;
        }
        if (oroginal ==rev){
            System.out.println("Number is Palindrome : "+ num);
        }
      else {
            System.out.println("Number is not a Palindrome");
        }
    }
}
