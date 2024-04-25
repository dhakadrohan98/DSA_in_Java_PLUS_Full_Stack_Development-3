package org.tabulation.problem;

public class MinimumPathSumTabulation {
	// Tabulation approach
	// TC: O(m * n)
	// SC: O(m * n) dp array
	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int[][] dp = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// base case
				if (i == 0 && j == 0) {
					dp[i][j] = grid[0][0]; // If we're at the top-left cell, the minimum sum is its value
				} else {
					int up = grid[i][j];
					//Requiring previous row's j column
					if (i > 0)
						up += dp[i - 1][j]; // Add the value from above if it's not out of bounds
					else
						up += (int) Math.pow(10, 9); // Add a large value if out of bounds in the up direction

					int left = grid[i][j];
					//Requiring current row's j-1 column
					if (j > 0)
						left += dp[i][j - 1]; // Add the value from the left if it's not out of bounds
					else
						left += (int) Math.pow(10, 9); // Add a large value if out of bounds in the left direction
					
					dp[i][j] = Math.min(up, left);
				}
			}
		}
		return dp[m - 1][n - 1];
	}
}
