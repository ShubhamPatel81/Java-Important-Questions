package src.array;

public class BiotonicArray {

    //In biotonic array first it goes to the increasing order and then after that it will be in decreasing order
    //may be first index value or last index value minimum --> {1,4,5,7,8,9,11,5,4,2,1,0}
    public static  int returnMinNumber(int[] arr){
        int n = arr.length;

        if (arr[0] < arr[n-1]){
            return arr[0];
        }
        else return arr[n-1];
    }


    public  static boolean isMountArray(int arr[]){
        //mount array -> formed mount like structure {1,2,4,5,8,9,3,2,1}
        int idx = 0;
        int n = arr.length;
        // find increasing sequence
        while(idx < n-1){
            if(arr[idx]<arr[idx+1]) idx++;
            else break;
        }
        if(idx == 0 || idx == n-1) return false;

        // find decreasing sequence
        while(idx < n-1){
            if(arr[idx] > arr[idx+1]) idx++;
            else break;
        }
        return (idx == n-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end =n-1;

        while(start <= end){
            int mid = start +(end - start)/2;
            if(mid != 0 && mid != n-1 && arr[mid] > arr[mid-1] && arr[mid] > arr[mid+ 1]){
                return arr[mid];
            }
            else if(mid != n-1 && arr[mid] < arr[mid+1]){//increasing half
                start =  mid+1;
            }else{
                //decreasing
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,6,9,11,7,2,1};
        int res = returnMinNumber(arr);
        System.out.println("Minimum Element in the Biotonic Array is : "+res);

        System.out.println("Array is mountain array is or not : "+ isMountArray(arr));

        int [] arr1 = {1,5,4};

        System.out.println("Find the peek element in the Bitonic array: "+peakIndexInMountainArray(arr1));

    }
}
