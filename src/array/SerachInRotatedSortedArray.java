package src.array;

public class SerachInRotatedSortedArray {

    public static  int searchInSortRotatedArray(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end -start)/2;

            if (target == arr[mid] ) return  mid;
            if (arr[start] <= arr[mid]){  // THIS will represent that left side array is sorted
                if (target >= arr[start] && target < arr[mid]){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
            else {
                if (target > arr[mid ] && target <= arr[end]){ // this will search towards the right side of the array
                    start = mid +1;
                }else {
                    end = mid -1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr []= {4,5,6,7,0,1,2};
        int target = 0;
        int ans = searchInSortRotatedArray(arr, target);
        System.out.println("Element fount at the index of Rotated Sorted Array is : " +ans);
    }
}
