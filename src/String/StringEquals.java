package src.String;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word 1: ");
        String w1 =sc.nextLine();
        System.out.println(w1);
        System.out.println("Enter word 2: ");
        String w2 = sc.next();
        System.out.println(w1);



    }
}
