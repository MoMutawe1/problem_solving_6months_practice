package _1_july.easy_questions;

// question description: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeBuySellStock1 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        //int[] prices = {2,4,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        int counter=0;
        for(int i: prices){
            if(i<min)
                min = i;
            if(prices[counter]-min>maxProfit)
                maxProfit=prices[counter]-min;
            counter++;
        }
        return maxProfit;
    }
}
