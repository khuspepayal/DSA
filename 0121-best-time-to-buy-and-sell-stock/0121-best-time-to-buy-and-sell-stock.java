class Solution {
    public int maxProfit(int[] prices) {
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;

        for(int price : prices){
            min_price=Math.min(min_price,price);
            max_profit=Math.max(max_profit,price-min_price);
        }
        return max_profit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna