package src.Arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6,7};
        System.out.println("Original Array is : " +Arrays.toString(array));

        reverseArray(array);
        System.out.println("Reverse Array is : "+ Arrays.toString(array));
    }
    public  static  void  reverseArray(int [] array){
        int left = 0;
        int right = array.length-1;
        while (left<right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;

        }
    }
}