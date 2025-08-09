package src.array;

public class MinimizeAndMaximize {
    // using binary search
    public static  int minimizedMaximum(int n, int[] arr) {
        int start =1;
        int end = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > end){
                end = arr[i];
            }
        }
        int res = -1;
        while(start <= end){
            int mid = start +(end - start)/2;

            if(isDistributionPossible(arr, mid, n)){
                res = mid;
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return res;
    }
      static  boolean  isDistributionPossible(int [] arr , int mid, int n ){
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            count += arr[i]/mid;
            if(arr[i] % mid != 0){
                count += 1;
            }
            if(count > n){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
      int   n = 7;
      int []quantities = {15,10,10};
      //output should be = 5
        int ans = minimizedMaximum(n, quantities);
        System.out.println("Minimum ans is : "+ans);
    }
}
