package src.sorting;

import java.util.Scanner;

public class BubbleSort {


    public static void bubbleSort(int n, int [] arr){
        System.out.println("Bubble Sorted Array is : ");
        for (int i = 1; i< n-1 ; i++){
            for (int j = 0 ; j < n-i; j++){

                if (arr[j] > arr[j+1]){
                    //swap
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }




    public static void printArray(int n, int[] arr){
        System.out.println("Array is : ");
        for (int i = 0 ; i<n-1; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size if the array: ");
        int n  = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter the value if array: ");
        for (int i = 0 ; i< n-1; i++){
            arr[i] = sc.nextInt();
        }
        printArray(n, arr);
        bubbleSort(n,arr);
    }
}
