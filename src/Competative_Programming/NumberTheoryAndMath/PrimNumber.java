package src.Competative_Programming.NumberTheoryAndMath;

public class PrimNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to print all prime numbers up to n
    public static void printPrimesUpTo(int n) {
        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // for clean output
    }

    public static void main(String[] args) {
        // Example usage:
        int number = 29;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        System.out.println("Prime numbers up to 100:");
        printPrimesUpTo(100);
    }

}
