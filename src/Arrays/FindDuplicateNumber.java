package src.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    public static int findDuplicateUsingForLoop(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1; j <nums.length ; j++ ){
                if(nums[i] == nums[j] ) return nums[i];
            }
        }
        return-1;
    }
    public static int findDuplicateUsingSorting(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] == nums[i-1]) return nums[i];
        }
        return-1;
    }

    public  static  int findDuplicatesUsingHashMap(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            if (map.containsKey(num)){
                return num;
            }else {
                map.put(num,1);
            }
        }
        return -1;
    }

    // this is using cyclic sort method
    // In cyclic sort -> if ( arr[index_Value] != arr[index_Position] , then swap and return the final ans
    public static int findDuplicateUsingCyclicSort(int[] nums) {
        cycleSort(nums);
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
        return -1;
    }
    public static void cycleSort(int [] nums){
        int n = nums.length;
        int index = 0;
        while(index < n){
            int element = nums[index];
            int pos = element -1;
            if(nums[index] != nums[pos]){
                swap(nums, index, pos);
            }
            else {
                index++;
            }
        }
    }
    public static void swap(int [] nums,int index1 , int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int [] array = {1,3,1,2,4,5,6,7};
        int ans = findDuplicate(array);
        System.out.println("Duplicate number is : " + ans);
        System.out.println("Duplicate is using For Loop : "+ findDuplicateUsingForLoop(array));
        System.out.println("Duplicate is using  Sorting : "+ findDuplicateUsingSorting(array));
        System.out.println("Duplicate is using  HashMap : "+ findDuplicatesUsingHashMap(array));
    }
}
