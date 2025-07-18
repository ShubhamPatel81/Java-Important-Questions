package src.Top_Interview_150_leetcode;


//Example:
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
import java.util.Arrays;

public class Rotate_Array_189 {
    public void rotate(int nums[], int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k >= n
        reverse(nums, 0, n - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, n - 1); // Reverse the rest of the array
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        Rotate_Array_189 ans = new Rotate_Array_189();
        ans.rotate(nums, k);

        // Print the rotated array
        System.out.println("Rotated Array is: " + Arrays.toString(nums));
    }
}
