package src.Arrays;

public class SquareRoot {
    public static   int mySqrt(int x) {
        int start =1;
        int end= x;

        while(start <= end){
            int mid = start +(end-start)/2;

            if(mid <= x/ mid){
                if(x% mid == 0 && mid == x/mid){
                    return mid;
                }
                start= mid+1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int x = 8;
//        int ans= (int) Math.sqrt(x);
//        System.out.println(ans);
        int ans = mySqrt(x);
        System.out.println("Square root using Binary Search Method is : "+ans);
    }
}
