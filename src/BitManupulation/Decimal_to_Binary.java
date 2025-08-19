package src.BitManupulation;

import java.util.Scanner;

public class Decimal_to_Binary {

    public static  String decimal_to_binary(int n){
        StringBuilder binary =new StringBuilder();
        while (n > 0){
            int rem = n % 2;
            binary.append(rem).toString();
            n /= 2;

        }
        return binary.reverse().toString();
    }
    public static int binary_to_decimal(String s){
            int n = s.length();
            int p =1;
            int decimal = 0;
            for (int i = n-1; i >=0 ; i--){
                if (s.charAt(i) == '1'){
                    decimal += p;
                }
                p *=2;
            }
            return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(decimal_to_binary(n));

        System.out.println("Enter the binary digit : ");
        String s = sc.next();
        System.out.println(binary_to_decimal(s));

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Bitwise OR :  "+ (a | b));
        System.out.println("Bitwise AND :  "+ (a | b));

    }
}
