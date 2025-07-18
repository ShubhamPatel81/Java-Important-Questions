package src;

import java.util.Arrays;

public class UniqueNumber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 3, 4, 4};

        findUniqueNumber(nums);

    }
    public static void  findUniqueNumber(int[ ] nums){
        Arrays.sort(nums);
        for (int i = 0 ; i <nums.length;i++){
            if ((i ==0 || nums[i] != nums[i-1]) && (i == nums.length-1 ||nums[i]!=nums[i+1]) )
            {
                System.out.println("Unique number is : "+nums[i]);
            }
        }
    }
}
