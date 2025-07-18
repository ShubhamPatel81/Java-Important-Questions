//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//        Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).

package src.Top_Interview_150_leetcode;
public class Remove_Duplicates {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return ++j;
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        Remove_Duplicates ans = new Remove_Duplicates();
       int res = ans.removeDuplicates(nums);
        System.out.println("Removed Number of Duplicates is : "+res);
    }
}
