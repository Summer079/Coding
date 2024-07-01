package SlidingWindow;

import java.util.*;

public class maxProfit_II {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int[] prices1 = {7, 2, 8, 1, 3};
        System.out.println("Example 1:");
        System.out.println("Input: prices = " + Arrays.toString(prices1));
        System.out.println("Output: " + maxProfit(prices1)); // Output: 7
        System.out.println();
        
        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println("Example 2:");
        System.out.println("Input: prices = " + Arrays.toString(prices2));
        System.out.println("Output: " + maxProfit(prices2)); // Output: 4
        System.out.println();
        
        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println("Example 3:");
        System.out.println("Input: prices = " + Arrays.toString(prices3));
        System.out.println("Output: " + maxProfit(prices3)); // Output: 0
    }
}
