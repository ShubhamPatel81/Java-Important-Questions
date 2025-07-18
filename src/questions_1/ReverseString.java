package src.questions_1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String ans = sb.append(str).reverse().toString();
        System.out.println(ans);
    }
}
