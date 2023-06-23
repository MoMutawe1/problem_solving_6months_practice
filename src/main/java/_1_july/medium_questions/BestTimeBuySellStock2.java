package _1_july.medium_questions;

// question description: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class BestTimeBuySellStock2 {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int i=0;
        int profit = 0;

        while(i<prices.length-1){
            if(prices[i+1]-prices[i] > 0){
                profit += prices[i+1]-prices[i];
            }
            i++;
        }
        return profit;
    }
}
