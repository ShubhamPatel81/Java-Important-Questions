//Example 1:
//
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

package src.Top_Interview_leetcode;

public class Best_Time_to_Buy_and_Sell_Stock_121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i =1; i< prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else if(prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        Best_Time_to_Buy_and_Sell_Stock_121 ans = new Best_Time_to_Buy_and_Sell_Stock_121();
        int res=ans.maxProfit(prices);
        System.out.println("Maximum profit is : "+res);
    }
}
