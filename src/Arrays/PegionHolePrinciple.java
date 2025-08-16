package src.Arrays;

public class PegionHolePrinciple {

//    this is helpful to find the duplicates form an array

    public  static  int findDuplicaties(int[] nums){

        for (int i = 0 ; i< nums.length; i++){
            int element = Math.abs(nums[i]);
            int actualIndex = element -1;
            if (nums[actualIndex] < 0) return element;
            nums[actualIndex] = -1*nums[actualIndex];
        }
        return  -1;
    }

    public static void main(String[] args) {
       int nums[] = {1,3,4,2,2};
        System.out.println("Duplicate using Pegion Method : "+findDuplicaties(nums));
    }
}
