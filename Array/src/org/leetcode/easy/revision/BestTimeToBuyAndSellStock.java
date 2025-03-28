package org.leetcode.easy.revision;

public class BestTimeToBuyAndSellStock {
	
	//TC: O(n)
    //SC: O(1)
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxi = 0;
        int len = prices.length;
        for(int i = 0; i < len; i++) {
            int profit = prices[i] - buy;
            maxi = Math.max(maxi, profit);
            if(prices[i] < buy) {
                buy = prices[i];
            }
        }
        return maxi;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
