package src.Arrays;

public class InsertElementAtIndex {

    public  static  void  insertAtPos(int []arr,  int pos,int element){
        int n = arr.length;
        for (int i =n-1 ; i >pos-1 ; i-- ){
            arr[i] = arr[i-1];
        }
        arr[pos] =element;
    }

    public static void printArray(int arr[]){
        for (int i =  0 ; i< arr.length-1;i++ ){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,6,7,9,12,33,34,56,76,67};
        int pos = 3;
        int element = 100;
        System.out.println("Original Array is : ");
        printArray(arr);
        System.out.println("After inserting element "+element+" at pos "+pos +" is : "  );
        insertAtPos(arr,pos,element);
        printArray(arr);
    }
}
