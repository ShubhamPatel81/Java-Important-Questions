package src.DP;

//leetcode 518
public class CoinChangeII {
        public static int change(int amount, int[] coins) {

            int n = coins.length;
            int prev[] = new int[amount+1];
            for(int a =0 ; a < amount+1 ; a++){
                if(a % coins[0] == 0){
                    prev[a] = 1;// a / coins[0];
                }else{
                    prev[a] = 0; //(int)(1e9);
                }
            }
            for(int i =1 ; i < n ; i++){
                int curr[] = new int[amount+1];
                for(int a = 0; a < amount+1 ; a++){
                    int pick =0;// (int)(1e9);
                    if(a>= coins[i]){
                        pick= curr[a-coins[i]];
                    }
                    int noPick = prev[a];
                    curr[a] = pick +noPick; //Math.min(pick, noPick);
                }
                prev = curr;

            }
            // if(prev[amount] == (int)(1e9)) return -1;
            return prev[amount];
        }

    public static void main(String[] args) {
       int amount = 5;
       int []coins = {1,2,5};
       int ans = change(amount,coins);
        System.out.println("Total Number to formed the amount : "+ans);
    }
}
