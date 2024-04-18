package org.tabulation.problem;

public class ClimbingStairsTabulation {
	//Tabulation - Bottom up
	// TC: O(n)
	// SC: O(n)
	public int climbStairs(int n) {
		// dp[i] := the number of ways to climb to the i-th stair
		int[] dp = new int[n + 1];
		//taken from recursion base cases
		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i <= n; ++i)
			dp[i] = dp[i - 1] + dp[i - 2];

		return dp[n];
	}

	public static void main(String[] args) {

	}
}
