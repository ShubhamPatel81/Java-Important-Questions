package src;

import java.util.Arrays;

public class PrintingTwoDArray {


    //Generic Method :
    public static  <K> K doSomething(K k){
        System.out.println("Do Something is working ");
        return k;
    }
    public static  int printArray()[][] {// this will not get any error you can do n number of variations in this
            return new int [][]{{1,2,3,4},{6,4,2,4,6}};
    }
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(printArray()));

        System.out.println(doSomething("Shubham Patel "));


    }
}
