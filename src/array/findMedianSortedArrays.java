package src.array;

import java.util.Map;

public class findMedianSortedArrays {

    public static double findMedianSortedArray(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length){
            return  findMedianSortedArray(nums2, nums1);
        }
        // make num1 as min length array
        // call same function and change the params
        // if num1 was greater and num2 was smaller
        // so because we swapped these two, now num1 is smaller num2 is greater

        int n1 = nums1.length;
        int n2 = nums2.length;
        int N = n1 +n2;
        int start = 0;
        int end =  n1;
        while (start <= end){
            // mid --> cut
            int cut1 = start +(end -start)/2;
            int cut2 = N/2 - cut1;

            // l1, l2 , r1, r2
            int l1 = (cut1 == 0)?Integer.MIN_VALUE : nums1[cut1 -1];
            int l2 = (cut2 == 0)?Integer.MIN_VALUE : nums2[cut2 -1];
            int r1 = (cut1 == n1) ? Integer.MAX_VALUE: nums1[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE: nums2[cut2];

            // check if cut is valid
            if (l1 <= r2 && l2 <= r1) {
                //if odd
                if (N %2 != 0){
                    return  (double) Math.min(r1,r2);
                }
                else{
                    // even
                    return (double)( (Math.max(l1,l2) + Math.min(r1,r2))/2.0);
                }
            } else if (l1 > l2) {
                end = cut1 -1;
            }else{
                start = cut1 + 1;
            }
        }

    return 0.0;
    }

    public static void main(String[] args) {
        int nums1[] = {1,2};
        int  nums2[] = {3,4};
        double ans = findMedianSortedArray(nums1, nums2);
        System.out.println("Final median of the two sorted array is : "+ans);
    }
}
