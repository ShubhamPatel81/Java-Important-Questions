package src.Generic;

public class PrintArray {

    public static <T> void printArrayData(T[] arr){
        for (T t : arr){
            System.out.print(t +" ");
        }
    }

    public static void main(String[] args) {
        String name[] = {"James","Jeo", "John"};

        Integer [] number = {1,2,4,5,6,7};

        printArrayData(name);
        System.out.println();
        printArrayData(number);
    }
}
