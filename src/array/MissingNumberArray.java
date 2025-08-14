package src.array;

import java.util.Arrays;

public class MissingNumberArray {
    public  static int missingNumber(int[] nums) {
        // find the sum of all the number from 0 to N and then find the array sum and subtract it .Whatever the difference will be it is the missing number
        int n= nums.length;
        int originlSum = n * (n+1)/2;// formula of sum of natural number [0,N] --> n * (n +1)/2
        int actualSum = 0;
        for(int i = 0 ; i < n ; i++){
            actualSum += nums[i];
        }

        return originlSum-actualSum;
    }

    // another method to find missing number
    public static  int missingNumebr(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i<n; i++){
            if (arr[i] != i){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {0,4,3,1,6,5};
        System.out.println("Missing Number(Using Sum formula) is: "+missingNumber(arr));
        System.out.println("Missing Number(Using index_Value and Value both should same) is: "+missingNumebr(arr));
    }
}
