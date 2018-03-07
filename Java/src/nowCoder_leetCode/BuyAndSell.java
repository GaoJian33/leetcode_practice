/*
Say you have an array for which the i th element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).


 */


import java.util.HashSet;

import static java.lang.Integer.MIN_VALUE;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {3,4,5,1,2,4,7,10};
        int buy1 = MIN_VALUE, buy2 = MIN_VALUE;
        int sell1 = 0, sell2 = 0;
        for(int i = 0; i < prices.length;i++){
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
        }

        System.out.println(sell1);
    }
}
