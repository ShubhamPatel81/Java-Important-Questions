package src.array;

public class FindMinSumOfThreshold {

    public static void main(String[] args) {
        int nums1[] = {44,22,33,11,1};
        int threshold1 = 5;
        int ans = smallestDivisor(nums1,threshold1);
        System.out.println("The smallest Divisor is : "+ans);

    }

    private static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        // this will find the max value in the Array (for using binary search )
        for (int i = 0; i< nums.length; i++){
            if (nums[i] >end){
                end = nums[i];
            }
        }
        int res = -1;
        while (start <= end){
            int mid = start + (end -start)/2;
            if (isDivionPossible(nums, mid, threshold)){
                res  = mid;
                end = mid -1;
            }
            else {
                start = mid +1;
            }
        }

        return res;
    }

    private static boolean isDivionPossible(int[] nums, int divisor, int threshold) {
               int sumOfDivisor = 0;
               for (int i =  0 ; i< nums.length ; i++){
                   sumOfDivisor += nums[i]/divisor;
                   if (nums[i] % divisor != 0){
                       sumOfDivisor +=1;
                   }
               }
               if (sumOfDivisor > threshold) return false;
               return true;
    }
}
