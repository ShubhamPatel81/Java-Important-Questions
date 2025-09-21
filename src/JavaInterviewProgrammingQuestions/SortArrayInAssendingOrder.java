package src.JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class SortArrayInAssendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] =new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arr);

        System.out.println("After Sorting the array is : ");
        sortInAssendingOrder(arr);
        printArray(arr);


    }
    public static void printArray(int arr[]){
        for (int i = 0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public  static void sortInAssendingOrder(int arr[]){
        // 2 3 5 6 6 7 8 8 4 445 (size -10)
        int n = arr.length;
        for (int i = 0 ; i < n -1 ; i ++){
            for (int j = 0 ; j < n - i -1 ; j++){ //10-0-1
                if (arr[j]> arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
