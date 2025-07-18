package src.Arrays;

public class FindDuplicateNumber {

   public static int  findDuplicate( int [] nums){
      int slow = nums[0];
      int fast = nums[0];
      do {
          slow= nums[slow];
          fast = nums[nums[fast]];

      }
      while (slow!= fast);
      slow = nums[0];
      while (slow != fast){
          slow = nums[slow];
          fast = nums[fast];
      }

       return  slow;
   }

    public static void main(String[] args) {
        int [] array = {1,3,1,2,4,5,6,7};
        int ans = findDuplicate(array);
        System.out.println("Duplicate number is : " + ans);
    }
}
