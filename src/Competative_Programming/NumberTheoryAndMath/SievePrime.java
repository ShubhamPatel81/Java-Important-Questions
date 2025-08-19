package src.Competative_Programming.NumberTheoryAndMath;

import java.util.Scanner;

public class SievePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");
        sieveOfEratosthenes(n);
    }

    // Sieve of Eratosthenes
    static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        // Step 1: Assume all numbers are prime initially
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Step 2: Eliminate non-primes
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // mark all multiples of p as not prime
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        // Step 3: Print primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

}
