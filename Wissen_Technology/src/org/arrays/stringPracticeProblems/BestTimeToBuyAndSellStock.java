package org.arrays.stringPracticeProblems;

public class BestTimeToBuyAndSellStock {
	//TC: O(n)
    //SC: O(1)
	public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n <= 1) {
            return 0;
        }
        int max = 0;
        int buy = prices[0];
        int sell = 0;
        int profit = 0;
        
        for(int i=1; i<n; i++) {
            if(buy < prices[i]) {
                sell = prices[i];
                profit = sell - buy;
                max = Math.max(max, profit);
            }
            if(prices[i] < buy) {
                buy = prices[i];
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
