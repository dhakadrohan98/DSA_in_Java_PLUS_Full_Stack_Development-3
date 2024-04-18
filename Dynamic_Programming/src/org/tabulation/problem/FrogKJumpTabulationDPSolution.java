package org.tabulation.problem;import org.space.optimizationsolution.FrogJump;

public class FrogKJumpTabulationDPSolution {

	public static int frogJump(int n, int[] heights, int k) {
		// declare dp of size n+1;
		int[] dp = new int[n + 1];
		// constant operation similar to base case of recusive solution
		dp[0] = 0;

		for (int indx = 1; indx < n; indx++) {
			int minSteps = Integer.MAX_VALUE;
			for (int j = 1; j <= k; j++) {
				// similar to if(indx > 1) for 2 steps jump.
				int jump = Integer.MAX_VALUE;
				if (indx - j >= 0) {
					jump = dp[indx - j] + Math.abs(heights[indx] - heights[indx - j]);
				}
				minSteps = Math.min(minSteps, jump);
			}
			dp[indx] = minSteps;
			System.out.println(" indx - " + indx + " dp[indx]: " + dp[indx]);
		}
		return dp[n-1];
	}

	public static void main(String[] args) {
		int[] heights = { 30, 10, 60, 10, 60, 50 };
		int k = 5;
		System.out.println(frogJump(heights.length, heights, k));

	}

}
