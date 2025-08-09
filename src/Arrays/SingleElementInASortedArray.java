package src.Arrays;

public class SingleElementInASortedArray {

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-2;
        while(start <= end){

            int mid = start + ( end -start)/2;
            if(nums[mid] == nums[mid^1]){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return nums[start];
    }
    public static void main(String[] args) {
        int arr[] ={1,1,2,3,3,4,4,8,8};
        int ans= singleNonDuplicate(arr);
        System.out.println("The Single element in a Sorted Array(Using Binary Search and Bitwise) is : "+ ans);

    }
}
