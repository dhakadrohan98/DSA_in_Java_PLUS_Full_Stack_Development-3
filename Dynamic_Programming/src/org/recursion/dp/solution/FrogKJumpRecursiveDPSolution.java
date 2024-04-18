package org.recursion.dp.solution;

import java.util.Arrays;

public class FrogKJumpRecursiveDPSolution {
	//TC: O(n * k)
	//SC: O(n) stack space + O(n) arrya space
	public static int frogJump(int n, int heights[], int k) {
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		int ans = fuc(n - 1, heights, dp, k);
		return ans;
	}

	// recursive calls
	private static int fuc(int indx, int[] heights, int[] dp, int k) {
		// base case
		if (indx == 0)
			return 0;
		if (dp[indx] != -1) {
			return dp[indx];
		}

		int minSteps = Integer.MAX_VALUE;
		// for each indx calculation will be for K jump
		for (int j = 1; j <= k; j++) {
			// similar to if(indx > 1) for 2 steps jump.
			// indx - 1
			// indx - 2
			// indx - 3
			// indx - 4
			// .....
			// indx - k for k steps jump
			int jump = Integer.MAX_VALUE;
			if (indx - j >= 0) {
				jump = fuc(indx - j, heights, dp, k) + Math.abs(heights[indx] - heights[indx - j]);
			}
			minSteps = Math.min(minSteps, jump);
		}
		dp[indx] = minSteps;
		System.out.println(" indx - " + indx + " dp[indx]: " + dp[indx]);

		return dp[indx];
	}

	public static void main(String[] args) {
		int[] heights = { 30, 10, 60, 10, 60, 50 };
		int k = 5;
		System.out.println(frogJump(heights.length, heights, k));
	}
}
