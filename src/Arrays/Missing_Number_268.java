package src.Arrays;

public class Missing_Number_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum =  n * (n + 1) / 2;
        int actualSum = 0;
        for(int num: nums){
            actualSum+=num;
        }
        return totalSum-actualSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8,9};
        Missing_Number_268 ms = new Missing_Number_268();
        int ans = ms.missingNumber(arr);
        System.out.println("The missing number is : "+ans);
    }
}
