package org.recursion.dp.solution;

import java.util.Arrays;

public class MinimumPathSumMemoization {
	// TC: O(m * n)
	// SC: O(m * n) stack space + O(m-1) + (n-1) dp array
	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int[][] dp = new int[m][n];
		for (int[] temp : dp) {
			Arrays.fill(temp, -1);
		}
		return rec(grid, m - 1, n - 1, dp);
	}

	private int rec(int[][] grid, int i, int j, int[][] dp) {
		// Three base case
		if (i == 0 && j == 0) {
			return grid[0][0];
		}
		if (i < 0 || j < 0) {
			return (int) Math.pow(10, 9); // If we're out of bounds, return a large value
		}
		if (dp[i][j] != -1)
			return dp[i][j];
		
		int up = grid[i][j] + rec(grid, i - 1, j, dp);
		int down = grid[i][j] + rec(grid, i, j - 1, dp);
		return dp[i][j] = Math.min(up, down);
	}
}