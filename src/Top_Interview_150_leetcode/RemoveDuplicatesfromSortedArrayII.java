//Input: nums = [0,0,1,1,1,1,2,3,3]
//        Output: 7, nums = [0,0,1,1,2,3,3,_,_]
//        Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).

package src.Top_Interview_150_leetcode;
public class RemoveDuplicatesfromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        int i= 0;
        for(int n: nums){
            if(i<2|| n != nums[i-2]){
                nums[i++] = n;

            }
        }
        return i;
    }

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3};
        RemoveDuplicatesfromSortedArrayII ans = new RemoveDuplicatesfromSortedArrayII();
        int res =ans.removeDuplicates(nums);
        System.out.println("Removed Element is : "+ res);
    }
}
