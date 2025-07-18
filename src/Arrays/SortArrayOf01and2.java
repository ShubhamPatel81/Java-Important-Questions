package src.Arrays;

import java.util.Arrays;

public class SortArrayOf01and2 {
    public static void main(String[] args) {
        int [] array = {1,2,1,1,2,1,0,0,1,0,2,1,0};
//        Arrays.sort(array);
//        System.out.println("Sorted Array is : " +Arrays.toString(array));
        sortArray(array);
        System.out.println("Sorted Array is : " + Arrays.toString(array));
    }
    public static void sortArray(int[] array){
        int low = 0;
        int mid = 0;
        int high = array.length-1;
        while (mid <= high){
            if (array[mid] ==1 ){
                mid++;
            } else if (array[mid] == 0) {
                swap(array, mid, low);
                mid++;
                low++;
            }
            else {
                swap(array, mid, high);
                high--;
            }
        }
    }
    public static void swap(int array[], int i , int j){
        int temp= array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
/*
arr = [1,2,1,0,0,1,0,2,1,0]
------******0-----*****1----******2---
//logic
while(mid<= high):
mid = 0 ;
low = 0;
high = arr.length-1;
if:
    arr[mid] == 1: // we are not going to do  anything with 1
        mid++;
if :
    arr[mid ]== 0:
        swap(arr, mid, low);// swap mid with low
            low++;
            mid++;
if :
    arr[m] == 2:
        swap (arr, high , mid):
            high--;

swap(arr, int i , int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        }
*/