package org.tabulation.problem;

public class FibonacciTabulationDp {
//Tabulation - Bottom up
	//TC: O(n)
	//SC: O(n)
	public static void main(String[] args) {
		int num = 8;
		//step-1
		int[] dp = new int[num+1];
		//step-2
		//Dp for base cases
		dp[0] = 0;
		dp[1] = 1;
		//step-3
		for(int i=2; i<num; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		for(int val:dp) {
			System.out.print(val + " ");
		}

	}

}
