// 121. Best Time to Buy and Sell Stock

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

public class sellStockQuestion {
    public static void main(String args[]) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        System.out.print(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        // My Logic

        // int result = 0;
        // for(int i = 0 ; i < prices.length ; i++){
        // for(int j = i+1 ; j < prices.length ; j++){
        // if(prices[i]< prices[j]){
        // int newResult = prices[j]-prices[i];
        // result = Math.max(result,newResult);
        // }
        // }
        // }

        // return result;

        // GPT LOGIC

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;

            maxProfit = Math.max(profit, maxProfit);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;

    }

}