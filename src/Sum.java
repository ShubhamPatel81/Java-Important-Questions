package src;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        while (num >= 10) { // Keep summing until num is a single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Extract the last digit and add to sum
                num /= 10; // Remove the last digit
            }
            num = sum; // Update num to be the new sum
        }

        System.out.println(num); // Print the final single-digit sum
    }
}
