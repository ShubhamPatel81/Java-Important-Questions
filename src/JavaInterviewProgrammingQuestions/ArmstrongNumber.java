package src.JavaInterviewProgrammingQuestions;
//ex = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153

import java.util.Map;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original =n;
        int res = 0;
        while (n > 0){
            int rem = n % 10;//121
            res += (int)Math.pow(rem,3);
            n= n /10;
        }
        System.out.println(res == original);
    }

}
