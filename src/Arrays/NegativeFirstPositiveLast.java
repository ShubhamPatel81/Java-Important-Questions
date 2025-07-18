package src.Arrays;

import java.util.Arrays;

public class NegativeFirstPositiveLast {
    public static void main(String[] args) {
         int[]array = {1,2,1,-9,-3,4,-2,-2,5};
         positiveFirstAndNegative(array);
        System.out.println("Final Array is : "+ Arrays.toString(array));
    }
    public static void positiveFirstAndNegative(int[ ] array){
      int left= 0;
      int right = array.length-1;
      while (left< right){
          if (array[left] < 0 && array[right] > 0){
              left++;
              right--;
          } else if (array[left] > 0 && array[right] < 0 ) {
              swap(array, left, right);
              left++;
              right--;

          }
          else if (array[left] < 0 && array[right] < 0 ){
              left++;
          } else if (array[left] > 0 && array[right]> 0) {
              right--;
          }
      }


    }
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
