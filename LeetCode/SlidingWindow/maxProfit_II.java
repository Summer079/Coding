/**
 * 
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * In this problem we are allowed to buy and sell stock multiple times.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the 
 * stock at any time. However, you can buy it then immediately sell it on the same day.
 *
 * Find and return the maximum profit you can achieve.
 * 
 * Example 1:
 * 
 * Input: prices = [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Total profit is 4 + 3 = 7.
 * 
 * Example 2:
 * Input: prices = [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Total profit is 4.
 * 
 * Example 3:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the 
 * maximum profit of 0.
 * 
 */

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
