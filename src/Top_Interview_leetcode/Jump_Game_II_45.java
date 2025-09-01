package src.Top_Interview_leetcode;
//Example 1:
//        Input: nums = [2,3,1,1,4]
//        Output: 2
//        Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
//
public class Jump_Game_II_45 {
    public int jump(int[] nums) {
        for(int i = 1; i<nums.length; i++){
            nums[i] = Math.max(nums[i]+i, nums[i-1]);
        }
        int jump = 0;
        int i  =0 ;
        while(i<nums.length -1){
            jump++;
            i = nums[i];
        }
        return jump;
    }

    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        Jump_Game_II_45 ans = new Jump_Game_II_45();
       int res =  ans.jump(nums);
        System.out.println("Minimum Number of Jump is : "+ res);
    }
}
