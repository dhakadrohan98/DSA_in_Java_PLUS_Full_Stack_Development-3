package org.space.optimizationsolution;

public class MinimumPathSumSpaceOptimization {
	//Space optimization
	//TC: O(m * n)
	//SC: O(n)
	public int minPathSum(int[][] grid) {
		// Requiring previous row's j column => (dp[i - 1][j]) => prev[j]
		// Requiring current row's j-1 column => (dp[i - 1][j]) => curr[j-1]

		int m = grid.length;
		int n = grid[0].length;
		int[][] dp = new int[m][n];
		// prev row -> dp[i-1]
		int[] prevRow = new int[n];

		for (int i = 0; i < m; i++) {
			// curr row -> dp[i]
			int[] currRow = new int[n];
			for (int j = 0; j < n; j++) {
				// base case
				if (i == 0 && j == 0) {
					currRow[j] = grid[0][0];
				} else {
					int up = grid[i][j];
					if (i > 0)
						up += prevRow[j]; // Add the value from above if it's not out of bounds
					else
						up += (int) Math.pow(10, 9); // Add a large value if out of bounds in the up direction

					int left = grid[i][j];
					if (j > 0)
						left += currRow[j - 1]; // Add the value from the left if it's not out of bounds
					else
						left += (int) Math.pow(10, 9); // Add a large value if out of bounds in the left direction

					currRow[j] = Math.min(up, left);
				}
			}
			//asssign curr array values to prev array
			prevRow = currRow;
		}
		return prevRow[n - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
