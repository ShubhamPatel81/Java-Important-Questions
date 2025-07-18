package src.sorting;

import java.util.Scanner;

public class InsertionSort {

//    [2,4,5,6,9,2,1,7]

    public static void insertionSort(int[ ] arr){

        int n = arr.length;

        for (int i = 1 ; i < n ;i++ ){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key){
                    arr[j+1] = arr[j];
                    j=j-1;
            }
            arr[j+1]=key;
        }
        printArray(n , arr);
    }


    public static void  printArray(int n , int arr[]){
        System.out.println("The array is : ");
        for (int i = 0 ; i<n-1; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=  sc.nextInt();

        int arr [] = new int[n];
        System.out.print("Enter the value of the array: ");
        for (int i = 0 ; i < n-1 ; i++){
            sc.nextInt();
        }
        printArray( n ,arr);

        System.out.println("Insertion Sort Array sorted :");
        insertionSort(arr);

    }

}
