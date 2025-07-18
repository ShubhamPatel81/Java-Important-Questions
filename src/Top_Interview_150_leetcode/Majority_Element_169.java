package src.Top_Interview_150_leetcode;
//Example:
//Input: nums = [2,2,1,1,1,2,2]
//        Output: 2

public class Majority_Element_169 {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 0;
        for(int i = 0 ;i < nums.length; i++){
            if(majority == nums[i]){
                count++;
            }
            else if(count == 0){
                majority = nums[i];
                count = 1;
            }
            else{
                count --;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        Majority_Element_169 ans = new Majority_Element_169();
        int res = ans.majorityElement(nums);
        System.out.println("Majority Element is : "+ res);
    }
}
