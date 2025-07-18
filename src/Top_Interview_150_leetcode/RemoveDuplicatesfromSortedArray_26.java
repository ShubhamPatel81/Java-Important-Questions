package src.Top_Interview_150_leetcode;
//
//Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).

public class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int j = 0; // Pointer to track the position of unique elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) { // Check if the current element is different from the last unique one
                j++; // Move the pointer for unique elements
                nums[j] = nums[i]; // Update the next position with the new unique element
            }
        }
        return j + 1; // The length of the unique part of the array
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2}; // Example input array
        RemoveDuplicatesfromSortedArray_26 r = new RemoveDuplicatesfromSortedArray_26();
        int k = r.removeDuplicates(nums); // Get the length of the unique part of the array

        System.out.println("Output: " + k + ", nums = ");
        for (int i = 0; i < k; i++) { // Print the first `k` elements, which are the unique elements
            System.out.print(nums[i] + " ");
        }
    }
}
