package src.recursion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size= sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the "+ size +" elements: ");
        for (int i = 0 ; i< size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("You Entered Array : ");
        for (int num : arr){
            System.out.println(num +" ");
        }

        System.out.println("Enter the target Value to find the index : ");
        int target = sc.nextInt();
//  int arr[]  ={1,4,2,6,3,78,44,444,57,8876,54,32};
//  int target =  2;

        int ans = search(arr, target ,0, arr.length-1);
        System.out.println("Target Index is : "+ans);
    }

    static int search(int[] arr , int target, int start,int end){
        if (start > end){
            return -1;
        }
        int middle = start +(end - start)/2;
        if (arr[middle] == target) return  middle;
        if (target < arr[middle]){
            return search(arr,target,start, middle-1);
        }
        return  search(arr, target, middle+1, end);
    }

}
