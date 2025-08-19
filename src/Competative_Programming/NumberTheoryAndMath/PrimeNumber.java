package src.Competative_Programming.NumberTheoryAndMath;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num){
        if (num == 0 || num ==1 )return false;
        // check from 2 to n-1, there is no factor
        for (int i = 2; i < num-1;i++){
            if (num % i == 0){
                // no prime
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Choose an option: ");
            System.out.println("1. Check Prime");
            System.out.println("2. Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the number to check prime or not : ");
                    int n=  sc.nextInt();
                    boolean res = isPrime(n);
                    if (res) {
                        System.out.println("Number is Prime Number");
                    } else {
                        System.out.println("Number is Not a Prime Number");
                    }
                    for (int i = 2; i<=n ; i++){
                        if (isPrime(i)) {
                            System.out.print(i + " "); // print prime number
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

    }
}
