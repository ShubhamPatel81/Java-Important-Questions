package src.DP;

import java.util.Arrays;


// leetcode 322
public class CoinChange {
        public static int coinChange(int[] coins, int amount) {
            int n = coins.length;
            int dp[][] =new int [n][amount+1];
            for(int i =0 ;i< n ;i++){
                Arrays.fill(dp[i],-1);
            }
            int res = recur(coins, amount,n-1,dp);
            if(res ==(int) (1e9)) return -1;
            return res;
        }
        public static int recur(int coins[],int amt, int idx,int dp[][]){
            if(idx == 0){
                if(amt % coins[idx] ==0)

                {
                    dp[idx][amt] = amt / coins[idx];
                    return amt / coins[idx];

                }
                dp[idx][amt] = (int)(1e9);
                return (int)(1e9);
            }
            if(dp[idx][amt]  != -1){
                return  dp[idx][amt];
            }
            int pick = (int)(1e9);
            if(amt >= coins[idx]){
                pick = 1 + recur(coins,amt-coins[idx],idx,dp);
            }
            int noPick = recur(coins, amt, idx-1,dp);
            dp[idx][amt] = Math.min(pick,noPick);
            return    dp[idx][amt];
        }

    public static void main(String[] args) {
        int [] coins = {1,2,5};
        int amount = 11;
        int ans = coinChange(coins, amount);
        System.out.println( "The fewest number of coins that you need to make up that amount : " +ans);
    }

}
