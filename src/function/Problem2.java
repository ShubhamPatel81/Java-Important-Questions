package src.function;

import java.util.Scanner;

public class Problem2 {

    public int arithmetic(int n, int m, char a) {
        switch (a){
            case '+':return m+n;
            case '-' :return n-m;
            case '*':return n*m;
            case '/':
                if (m == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return -1;
                }
                return n/m;

            default:
                System.out.println("Invalid operator . Use (+,-,/,*)");
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int n = sc.nextInt();

        System.out.print("Enter Number 2: ");
        int m = sc.nextInt();

        System.out.print("Enter the operation (+, -, *, /): ");
        char a = sc.next().charAt(0);  // Correct way to read a char

        Problem2 p = new Problem2();
        int ans = p.arithmetic(n, m, a);

        if (ans != -1) {
            System.out.println("Answer is: " + ans);
        }

        sc.close();
    }
}
