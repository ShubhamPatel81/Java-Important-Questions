package src.Top_Interview_leetcode;

//Input: nums = [1,2,3,4]
//        Output: [24,12,8,6]
//Given an integer array nums,
//        return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//        You must write an algorithm that runs in O(n) time and without using the division operation.


public class Product_of_Array_Except_Self_238 {
        public int[] productExceptSelf(int[] nums) {
            // int n = nums.length;
            // int [] res = new int[n];
            // for(int i = 0 ; i< n; i++){
            //     int mul = 1;
            //     for(int j = 0 ; j< n ;j++){
            //         if(i == j){
            //             continue;
            //         }
            //         else{
            //             mul = mul * nums[j];
            //         }
            //     }
            //     res[i] = mul;
            // }
            // return res;

            int n= nums.length;
            int ans[] = new int[n];
            ans[0] = 1;
            for(int i = 1 ; i< n ;i++){
                ans[i] = ans[i-1] * nums[i-1];

            }
            int suffix= 1;
            for(int j = n-1; j>=0; j--){
                ans[j] = ans[j] * suffix;
                suffix = suffix * nums[j];
            }
            return ans;
        }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        Product_of_Array_Except_Self_238 P = new Product_of_Array_Except_Self_238();

        int []ans = P.productExceptSelf(nums);

        System.out.println("The Value is ");
        for (int i = 0; i< ans.length; i++){
            System.out.print(ans[i] +" , ");
        }
    }
}
