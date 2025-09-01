//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]
//        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

package src.Top_Interview_leetcode;
import java.util.Arrays;

class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>= 0){
            if(num1[i] > num2[j]){
                num1[k] = num1[i];
                i--;
                k--;
            }
            else{
                num1[k] = num2[j];
                j--;
                k--;
            }
        }
        while(i>=0){
            num1[k] = num1[i];
            i--;
            k--;
        }
        while(j>=0){
            num1[k] = num2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
      int []  nums1 = {1,2,3,0,0,0};
      int m = 3;
      int [] num2= {2,5,6};
      int n= 3;
        H_Index_274 solution = new H_Index_274();
        solution.merge(nums1,m, num2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}