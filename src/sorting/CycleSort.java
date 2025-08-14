package src.sorting;

public class CycleSort {

    // this is for range 1 to N
    public static  void  cycleSort(int []arr){
        System.out.println("\nCyclic Sorted Array form 1 to N  : ");
        int n = arr.length;
        int index = 0 ;
        while (index < n){
            int element = arr[index];
            int actualPosition = element -1;
            if (arr[index] <n  && arr[index] != arr[actualPosition]){
                swap(arr, index , actualPosition);
            }else {
                index++;
            }
        }
    }

    public static  void  cycleSort0toN(int []arr){
        System.out.println("\nCyclic Sorted Array form 0 to N  : ");
        int n = arr.length;
        int index = 0 ;
        while (index < n){
            int element = arr[index];
            int actualPosition = element ;
            if (arr[index] <n  && arr[index] != arr[actualPosition]){
                swap(arr, index , actualPosition);
            }else {
                index++;
            }
        }
    }
    public static void cyclicSort(int arr[]){
        int n= arr.length;
        for (int cycles = 0 ; cycles <n -1; cycles++ ){
            int pos = cycles;
            int item= arr[cycles];

            // to find number of smaller elements
            for (int  i = cycles +1 ; i< n; i++){
                if (arr[i] < item){
                    pos++;
                }
            }
            //element is at correct position
            if (pos == cycles){
                continue;
            }
            //ignore duplicates
            while (arr[pos] == item){
                pos++;
            }
            // if smaller elements are found then perform swapping
            if (pos != cycles){
                int temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }
            // check if more swaps are required
            while (pos != cycles){
                 pos =cycles;
                // to find number of smaller elements
                for (int  i = cycles+1; i< n; i++){
                    if (arr[i] < item){
                        pos++;
                    }
                }
                //ignore duplicates
                while (arr[pos] == item){
                    pos++;
                }

                if (item != arr[pos]){
                    int temp = arr[pos];
                    arr[pos] = item;
                    item = temp;
                }
            }
        }
    }

    private static void swap(int[] arr, int index, int actualPosition) {
            int temp = arr[index];
            arr [index] = arr[actualPosition];
            arr[actualPosition]=temp;
    }
public static void printArray(int[] arr){
    System.out.println("Original Array is : ");
        int n = arr.length;
        for (int i = 0 ;i <n ; i++){
            System.out.print(arr[i]+" ");
        }
}
    public static void main(String[] args) {

        int arr[] = {2,7,1,5,4,6,3};
        printArray(arr);
        cycleSort(arr);
        printArray(arr);
        int arr1[] = {2,7,1,5,0,4,6,3};
        cycleSort0toN(arr1);
        printArray(arr1);


    }
}
