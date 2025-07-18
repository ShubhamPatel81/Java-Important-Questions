package src.Top_Interview_150_leetcode;

//Input: numbers = [2,7,11,15], target = 9
//        Output: [1,2]
//        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
//
public class TwoSum_II_nputArrayIsSorted_167 {
    public int[] twoSum(int[] nums, int target) {
        int left  = 0 ;
        int right = nums.length - 1;
        while(left < right ){
            int total = nums[left] + nums[right];
            if(total == target) {
                return new int[] {left +1 , right +1};
            }
            else if(total > target ){
                right --;
            }
            else{
                left ++;
            }
        }
        return new int []{-1,-1};
    }

    public static void main(String[] args) {
        int numbers[] = {2, 7, 11, 15};
        int target = 9;
        TwoSum_II_nputArrayIsSorted_167 t = new TwoSum_II_nputArrayIsSorted_167();
        int ans[] = t.twoSum(numbers, target);
        System.out.print("The index Value of getting target is : ");
        for (int i = 0; i < ans.length; i++) {


            System.out.print(ans[i] + " "  );
        }
    }
}
