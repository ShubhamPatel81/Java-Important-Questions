package src.Top_Interview_leetcode;

//Input: nums = [3,2,1,0,4]
//        Output: false
//        Explanation: You will always arrive at index 3 no matter what.
//        Its maximum jump length is 0, which makes it impossible to reach the last index.


public class Jump_Game_55 {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false; // Handle empty array
        if (nums.length == 1) return true; // Single element, always reachable

        int currentDest = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= currentDest) {
                currentDest = i;
            }
        }
        return currentDest == 0;
    }

    public static void main(String[] args) {
        int [] nums = {3,2,1,0,4};
        Jump_Game_55 ans = new Jump_Game_55();
        boolean res = ans.canJump(nums);
        System.out.println("Can Jump or not : "+res);

    }
}
