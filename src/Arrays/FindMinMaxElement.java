package src.Arrays;
import  java.util.*;
public class FindMinMaxElement {
    public static void main(String[] args) {

        int array[] = {1,3,5,3,1,4,7,4,-2,1,0};
        int result [] = findMaxMin(array);
        System.out.println("Min : "+ result[0] +"\n"+"Max : "+result[1]);
    }
    public static int [] findMaxMin(int [] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : array){
            if(element>max){
                max = element;
            }
            if(element < min){
                min = element;
            }
        }
        return  new int[]{min, max};
    }
}