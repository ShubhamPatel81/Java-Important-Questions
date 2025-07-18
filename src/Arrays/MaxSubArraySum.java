package src.Arrays;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for the size of the array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize the array with the specified size
        int[] array = new int[size];

        // Prompt for the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();  // Assign the input to each index of the array
        }

        // Display the elements of the array (optional, for verification)
        System.out.println("Array elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

       int maxSum = findMaxSum(array, size);

        System.out.println("\nThe maximum sum of the Sub array is : " + maxSum );
    }

        public  static int findMaxSum(int[] array , int size)
        {
            int sum = 0;
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0 ; i < size ; i++){
                sum = sum + array[i];
                maxSum = Integer.max(sum, maxSum);
                if (sum < 0 ){
                    sum = 0;
                }
            }
            return maxSum;
    }
}
