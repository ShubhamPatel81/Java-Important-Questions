package src.array.exponentialSearch;

public class ExponentialSearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,7,8,9,12,23,45,56,67};
//        int index = jumpSearch(arr, 67);
        int index = exponentialSearchInSortedArray(arr, 45);
        if (index == -1){
            System.out.println("Element Not Found !!!");
        }else {
            System.out.println("Element found at Index : "+index);
        }
    }

    private static int exponentialSearchInSortedArray(int[] arr, int target) {
            if (arr[0] ==target) return 0;
            int i = 1;
            int n =arr.length;

            // enclose the target
            while ( i < n && arr[i] <= target){
                i = 2 * i;
            }
            int end =Math.min(i,n-1);
            int index = binarySearchOnRange(arr,i/2,end,target);
            return index;
    }

    private static int binarySearchOnRange(int[] arr, int start, int end, int target) {
        int ans = -1;
        while (start <= end){
            int mid = start +(end -start)/2;
            if (arr[mid] == target){
                ans = mid;
                break;
            }else if (arr[mid]<target){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
    return  ans;
    }


}
