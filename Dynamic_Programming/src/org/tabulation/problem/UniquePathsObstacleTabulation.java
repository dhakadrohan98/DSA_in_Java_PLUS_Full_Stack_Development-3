package org.tabulation.problem;

import java.util.Arrays;

public class UniquePathsObstacleTabulation {
	// TC: O(m * n)
	// SC: O(m * n)
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] dp = new int[m][n];
//			for (int i = 0; i < m; i++) {
//				Arrays.fill(dp[i], 1);
//			}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// obstacle case
				if (obstacleGrid[i][j] == 1) {
					dp[i][j] = 0; // If there's an obstacle, no paths can go through here.
					continue;
				} // simple base case
				else if (i == 0 && j == 0) {
					dp[i][j] = 1;
					continue;
				}
				int up = 0;
				int left = 0;
				// Check if moving up is possible
				if (i > 0)
					up = dp[i - 1][j];
				// Check if moving left is possible
				if (j > 0)
					left = dp[i][j - 1];
				// Calculate the number of paths by adding paths from up and from the left
				dp[i][j] = up + left;
			}
		}
		return dp[m - 1][n - 1];
	}

	public static void main(String[] args) {
		int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int[][] obstacleGrid1 = { { 0, 1 }, { 0, 0 } };
		int[][] obstacleGrid2 = { { 0, 0, 0, 0 }, 
									{ 0, 1, 0, 1 }, 
									{ 0, 0, 0, 0 } };
		System.out.println(uniquePathsWithObstacles(obstacleGrid2));
	}

}
