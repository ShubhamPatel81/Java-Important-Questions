package src.JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class LargestAndSmallestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        printArray(arr);

        int largest = arr[0];
        int smallest = arr[0];
        int secondSmallest=arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > secondSmallest){
                secondSmallest = arr[i-1];
            }
        }

        System.out.println("\nLargest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Second Largest : "+secondSmallest);

        sc.close();
    }

    public static void printArray(int arr[]) {
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
