package org.ibm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumMovesToFindMedian {

	public static long getMinimumMoves(List<Integer> prices, int k) {
		long count=0;
		int len = prices.size();
		if(len == 1) {
			while(prices.get(0) != k) {
				if(prices.get(0) > k) {
					prices.set(0, prices.get(0)-1);
					count += 1;
				} else {
					prices.set(0, prices.get(0)+1);
					count += 1;
				}
			}
			return count;
		} else {
			Collections.sort(prices);
			int minMoves1 = 0;
			int minMoves2 = 0;
			
			for(int i=0; i <= len/2; i++) {
				if(prices.get(i) != k) {
					minMoves1 += Math.abs(prices.get(i) - k);
				}
				Collections.sort(prices);
				
				int median = (len+1)/2;
				if(k == prices.get(median-1)) {
					break;
				}
				
			}
			
			for(int j=len-1; j >= len/2; j--) {
				if(prices.get(j) != k) {
					minMoves2 += Math.abs(prices.get(j) - k);
				}
				Collections.sort(prices);
				
				int median = (len+1)/2;
				if(k == prices.get(median-1)) {
					break;
				}
				
			}
			
			count = Math.min(minMoves1, minMoves2);
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<Integer> prices1 = Arrays.asList(1,2,3);
		int k1 = 5;
		System.out.println(getMinimumMoves(prices1, k1));

	}

}
