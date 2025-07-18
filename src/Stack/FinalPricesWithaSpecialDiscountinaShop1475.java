package src.Stack;

import java.util.Arrays;
import java.util.Stack;

public class FinalPricesWithaSpecialDiscountinaShop1475 {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[prices.length];

        // Loop through all prices
        for (int i = 0; i < prices.length; i++) {
            // Apply discount for earlier items in stack
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int idx = stack.pop();
                res[idx] = prices[idx] - prices[i];
            }
            stack.push(i);  // Push current index to stack
        }

        // For all remaining elements in stack, no discount applies
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            res[idx] = prices[idx];
        }

        return res;  // Return the final prices array with discounts applied
    }

    public static void main(String[] args) {
        FinalPricesWithaSpecialDiscountinaShop1475 fp = new FinalPricesWithaSpecialDiscountinaShop1475();
        int[] prices = {8, 4, 6, 2, 3};

        // Get the result
        int[] result = fp.finalPrices(prices);

        // Print the result using Arrays.toString() to display array contents
        System.out.println("The final discounted prices are: " + Arrays.toString(result));
    }
}
