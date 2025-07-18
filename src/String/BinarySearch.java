package src.String;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int left,int right, int [] arr,int t){
        int mid = (left+right)/2;
        if (left > right ) {
            return -1;
        }
        else if(arr[mid] == t){
            return mid;
        }
        else if ( t  > mid){
            return binarySearch(mid+1,  right, arr, t);
        }
        else  {
            return binarySearch(left, mid-1,arr,t);
        }
    }
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the element of the array : ");
        for(int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value to search: ");
        int t = sc.nextInt();
        int ans = binarySearch(0, arr.length-1,arr,t);

        System.out.println("Value found at index : "+ans);

    }


}