package org.recursion.dp.solution;

import java.util.Arrays;

public class UniquePathsObstacleMemoization {
	//Recursive DP (Memoization)
	// TC: O(m * n)
	// SC: O(m * n) dp storage + O(m * n) stack space
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] dp = new int[m][n];
		// initialize dp with -1 values
		for (int i = 0; i < m; i++) {
			Arrays.fill(dp[i], -1);
		}
		return helper(obstacleGrid, dp, m - 1, n - 1);
	}

	private static int helper(int[][] arr, int[][] dp, int m, int n) {
		// base cases
		// include one more base case

		if (m < 0 || n < 0) {
			return 0;
		}
		// if we found obstacle at (m,n) indexes then don't consider this path
		if (m >= 0 && n >= 0 && arr[m][n] == 1) {
			return 0;
		}
		if (m == 0 && n == 0) {
			return 1;
		}
		if (dp[m][n] != -1) {
			return dp[m][n];
		}

		int up = helper(arr, dp, m - 1, n);
		int left = helper(arr, dp, m, n - 1);
		return dp[m][n] = up + left;
	}

	public static void main(String[] args) {
		int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int[][] obstacleGrid1 = { { 0, 1 }, { 0, 0 } };
		System.out.println(uniquePathsWithObstacles(obstacleGrid1));

	}
}
