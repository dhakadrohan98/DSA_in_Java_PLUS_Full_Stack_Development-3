package org.leetcodemedium.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BuyAndSellStock {

	public int maxProfit(int[] prices) {
		if (prices.length == 1) {
			return 0;
		}

		int maxProfit = 0;
		int mini = Integer.MAX_VALUE;

		for (int i = 0, j = 1; i < prices.length - 1 && j < prices.length; i++, j++) {
			mini = Math.min(mini, prices[i]);
			int cost = prices[j] - mini;
			maxProfit = Math.max(maxProfit, cost);
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int[] nums = { 7, 1, 5, 3, 6, 4 };
		int[] nums1 = { 7, 6, 4, 3, 1 };
		int[] nums2 = { 2, 1, 4 };
		int maxProfit = maxProfit(nums2);
		System.out.println(maxProfit);

	}
}

//int length = prices.length;
//
//for(int i=0; i<prices.length; i++) {
//	hmap.put(prices[i], i);
//}
//
//for(int key: hmap.keySet()) {
//	if(min > key && min != length-1) {
//		min = key;
//	}
//}

//int index = hmap.get(min);
//System.out.println("Min Index: " + index);
//for(int i=0; i<prices.length; i++) {
//	
//	if(index < i && max < prices[i] && index != prices.length-1 ) {
//		max = prices[i];
//	}
//}
//if(max <= 0) {
//	return 0;
//}
//System.out.println("Max: " + max);
//System.out.println("Min: " + min);
//int profit = max - min;
//
//if(profit < 0) {
//	return 0;
//}
