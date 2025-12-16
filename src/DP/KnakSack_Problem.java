package src.DP;

import java.util.Map;

public class KnakSack_Problem {
    // This is 0/1 KnapSack problem
    // using recursion pick and noPick method
  /*  static  int kanpSackRecur(int capacity, int val[], int weight[]){
        int n = val.length;
        return  recur(capacity,val, weight, n-1);
    }
    static  int recur(int capacity, int val[], int wt[], int idx){
        //base case
        if (capacity == 0) return 0;
        if (idx == 0){
            if (wt[idx]<=capacity) return val[idx];
            else return 0;
        }
        int pick = 0;
        if (wt[idx] <= capacity){
            pick = val[idx] + recur(capacity - wt[idx], val, wt, idx-1);
        }
        int noPick = 0 + recur(capacity,val, wt, idx-1);
        return Math.max(pick,noPick);
    }
*/

    // Using top-down approach if DP(Dynamic Programming)
    /*
    static  int kanpSackRecur(int capacity, int val[], int weight[]){
        int n = val.length;
        int dp [][] = new int[n][capacity+1];
        for (int i =0; i< n ;i++){
            for (int j = 0; j < capacity+1; j++){
                dp[i][j]= -1;
            }
        }
        return  recur(capacity,val, weight, n-1,dp);
    }
    static  int recur(int capacity, int val[], int wt[], int idx,int dp[][]){
        //base case
        if (capacity == 0) {
            dp[idx][capacity] = 0;
            return 0;
        }
        if (idx == 0){
            if (wt[idx]<=capacity)
            {
                dp[idx][capacity] = val[idx];
                return val[idx];
            }
            else {
                dp[idx][capacity] = 0;
                return 0;
            }
        }
        if (dp[idx][capacity]!= -1) return dp[idx][capacity];
        int pick = 0;
        if (wt[idx] <= capacity){
            pick = val[idx] + recur(capacity - wt[idx], val, wt, idx-1,dp);
        }
        int noPick = 0 + recur(capacity,val, wt, idx-1,dp);
        dp[idx][capacity] =Math.max(pick,noPick);
        return dp[idx][capacity];
    }
    */

    // Using full dp


    static  int kanpSackRecur(int capacity, int val[], int weight[]){
        int n = val.length;
        int dp [][] = new int[n][capacity+1];
        for (int i = 0; i < n;i++){
            dp[i][0]= 0;
        }
        for (int c =0; c <capacity+1;c++){
            if (weight[0]  <= c){
                dp[0][c] =val[0];
            }else {
                dp[0][c] =0;
            }
        }
        for (int i =1; i< n ;i++){
            for (int j = 0; j < capacity+1; j++){
                int pick = 0;
                if (weight[i] <= j){
                    pick = val[i] + dp[i-1][j-weight[i]];
                }
                int noPick = 0 +  dp[i-1][j]; //recur(capacity,val, wt, idx-1,dp);
                dp[i][j] =Math.max(pick,noPick);
            }
        }
        return  dp[n-1][capacity]; // recur(capacity,val, weight, n-1,dp);
    }


    public static void main(String[] args) {
        int capacity = 4;
        int val[] = {1,2,3};
        int wt [] ={4,5,1};
        int ans = kanpSackRecur(capacity,val,wt);
        System.out.println("Using knapSack answer is : " + ans);
    }
}
