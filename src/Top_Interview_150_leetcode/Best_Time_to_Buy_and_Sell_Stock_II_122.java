//Example 1:
//
//        Input: prices = [7,1,5,3,6,4]
//        Output: 7
//        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//        Total profit is 4 + 3 = 7.
//


package src.Top_Interview_150_leetcode;

public class Best_Time_to_Buy_and_Sell_Stock_II_122 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int count = 0;
        for(int i = 1 ; i< prices.length; i++){
            if(prices[i]< buy){
                buy = prices[i];
            }
            else{
                profit = prices[i] - buy;
                count += profit;
                buy = prices[i];
                prices[i] = prices[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int prices []= {7,1,5,3,6,4};
        Best_Time_to_Buy_and_Sell_Stock_II_122 ans = new Best_Time_to_Buy_and_Sell_Stock_II_122();
        int res = ans.maxProfit(prices);
        System.out.println("Maximum Profit is : "+res);
    }
}
