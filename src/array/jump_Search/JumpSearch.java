package src.array.jump_Search;

public class JumpSearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,7,8,9,12,23,45,56,67};
//        int index = jumpSearch(arr, 67);
        int index = ternarySearch(arr, 45);
        if (index == -1){
            System.out.println("Element Not Found !!!");
        }else {
            System.out.println("Element found at Index : "+index);
        }
    }

    // jump search
    public static  int jumpSearch(int [] arr, int target){
        int n =arr.length;
        int blockSize = (int) Math.sqrt(n);
        int start= 0;
        int end =blockSize;

        //jump the non-potential block
        while ( end < n &&  arr[end] <= target ){
            start = end;
            end += blockSize;
            if (end > n){
                end = n;
            }
        }
        // apply linear search
        int res = -1;
        for (int i = start ; i < end ; i++){
            if (arr[i] == target){
               res = i;
            }
        }
        return res;
    }

    // ternary Search
    public static  int ternarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int  index = -1;
        while (start <= end){
            int mid1 = start +(end -start)/3;
            int mid2 = end  - (end-start)/3;

            if (target <= arr[mid1] ){
                if (target == arr[mid1])
                {
                    index = mid1;break;
                }
                end = mid1 -1;
            }
            else if (target >= arr[mid2]){
                    if (target == arr[mid2]){
                        index = mid2;
                        break;
                    }
                    start = mid2+1;
            }else {
                start = mid1 +1;
                end = mid2 -1;
            }
        }
        return  index;
    }


}
