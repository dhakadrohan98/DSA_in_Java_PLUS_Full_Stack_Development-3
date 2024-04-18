package org.tabulation.problem;

public class FrogJumpTabulationDP {
	// Iterative solution, tabulation form
	// TC: O(n)
	// SC: O(n)
	public static int frogJump(int n, int[] heights) {
		int[] dp = new int[n + 1];
		// constant operation similar to base case of recusive solution
		dp[0] = 0;
		for (int i = 1; i < n; i++) {
			int firstStep = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
			int secondStep = Integer.MAX_VALUE;
			if (i > 1) {
				secondStep = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
			}
			dp[i] = Math.min(firstStep, secondStep);
			System.out.println("i - " + i + " dp[i] - " + dp[i]);
		}
		System.out.println("dp[6] : " + dp[n]);
		return dp[n - 1];
	}

	public static void main(String[] args) {
		int[] heights = new int[] { 30, 10, 60, 10, 60, 50 };

		System.out.println(frogJump(heights.length, heights));
	}

}
