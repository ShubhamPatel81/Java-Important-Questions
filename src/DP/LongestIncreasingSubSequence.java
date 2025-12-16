package src.DP;

import java.util.Arrays;

public class LongestIncreasingSubSequence {
        public static int lengthOfLIS(int[] nums) {
            int n = nums.length;
            int lis[] = new int [n];
            Arrays.fill(lis,1);
            int maxLen = 1;
            for(int i = 1; i < n; i++){
                for(int prev = 0; prev <i ; prev++){
                    if(nums[prev] < nums[i]){
                        lis[i]= Math.max(lis[i],1 + lis[prev]);
                    }
                }
                if(lis[i] > maxLen) maxLen = lis[i];
            }
            return maxLen;
        }

    public static void main(String[] args) {
       int [] nums = {10,9,2,5,3,7,101,18};
       int ans = lengthOfLIS(nums);
        System.out.println("The length of the longest strictly increasing subsequence is : "+ans);
    }
}
