package SlidingWindow;

class Profit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; 
        }
        
        int minPrice = prices[0]; // minimum price to the first day's price
        int maxProfit = 0; // maximum profit to 0
        
        
        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i]; 
            int currentProfit = currentPrice - minPrice;
            
            maxProfit = Math.max(maxProfit, currentProfit);
            
            minPrice = Math.min(minPrice, currentPrice);
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        Profit solution = new Profit();
        
        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Example 1:");
        System.out.println("Input: prices = " + java.util.Arrays.toString(prices1));
        System.out.println("Output: " + solution.maxProfit(prices1)); // Expected output: 5
        
        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("\nExample 2:");
        System.out.println("Input: prices = " + java.util.Arrays.toString(prices2));
        System.out.println("Output: " + solution.maxProfit(prices2)); // Expected output: 0
    }
}
