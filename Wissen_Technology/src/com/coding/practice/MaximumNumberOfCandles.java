package com.coding.practice;

public class MaximumNumberOfCandles {

	public static int solve(int N, int K) {
	    int totalCandles = N;
	    int newCandles = 0;

	    while (N >= K) {
	        // Calculate new candles obtained by burning K candles
	        newCandles = N / K;

	        // Update the total number of candles
	        totalCandles += newCandles;

	        // Calculate the remaining candles after making new ones
	        N = (N % K) + (newCandles);
	    }

	    return totalCandles;
	}
	
	public static void main(String[] args) {
		int maximum = solve(7, 4);
		System.out.println("Maximum Number Of Candles that can be burnt: "+maximum);
	}
}
