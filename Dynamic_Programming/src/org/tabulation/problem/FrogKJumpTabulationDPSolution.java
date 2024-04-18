package org.tabulation.problem;

import org.space.optimizationsolution.FrogJump;

public class FrogKJumpTabulationDPSolution {
	//TC: O(n * k)
	//SC: O(n)
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
		return dp[n - 1];
	}

	public static void main(String[] args) {
		int[] heights = { 30, 10, 60, 10, 60, 50 };
		int k1 = 5;
		System.out.println("k1 = " + k1);
		System.out.println(frogJump(heights.length, heights, k1));
		int k2 = 4;
		System.out.println("k2 = " + k2);
		System.out.println(frogJump(heights.length, heights, k2));
		int k3 = 3;
		System.out.println("k3 = " + k3);
		System.out.println(frogJump(heights.length, heights, k3));

	}
}
