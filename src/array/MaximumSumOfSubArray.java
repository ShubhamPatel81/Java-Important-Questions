package src.array;

import java.util.Map;
import java.util.Scanner;

public class MaximumSumOfSubArray {

    static int findMaxSum(int [] arr, int n){

        int max = Integer.MIN_VALUE;
        int sum =0;
        for (int i =0 ; i<n ; i++){
            sum += arr[i];
            max = Math.max(sum, max);
            if (sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    static  int withoutStandardFun(int []arr){
        int largest = arr[0];
        int s = arr[0];
        for (int i= 1; i< arr.length; i++){
            s = s+arr[i];
            if (arr[i] > s){
                s = arr[i];
            }
            if (s>largest){
                largest = s;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int ans = findMaxSum(arr, n);
        System.out.println("Maximum sum is : " + ans);

        int res = withoutStandardFun(arr);
        System.out.print("Without Standard FunctionExample: "+res);
    }
}
