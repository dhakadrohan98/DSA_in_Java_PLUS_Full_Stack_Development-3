package org.space.optimizationsolution;

public class UniquePathsObstacleSpaceOptimization {
	// Space optimization from Tabulation code
    // TC: O(m * n)
	// SC: O(n) to store curr rows values
	public static int uniquePathsWithObstacles(int[][] nums) {
		int m = nums.length;
		int n = nums[0].length;
		// Initialize the previous row of the DP matrix
		int[] prev = new int[m];

		// dp[i-1] means prev array
		// dp[i] means curr array
		for (int i = 0; i < m; i++) {
			// Create a temporary array for the current row
			int[] curr = new int[n];
			for (int j = 0; j < n; j++) {
				// base cases
				if (i > 0 && j > 0 && nums[i][j] == 1) {
					curr[j] = 0; // If there's an obstacle, no paths can go through here.
					continue;
				} else if (i == 0 && j == 0) {
					curr[j] = 1; // There's one valid path to the start cell.
					continue;
				}
				int up = 0;
				int left = 0;
				// Check if moving up is possible
				if (i > 0)
					up = prev[j];
				// Check if moving left is possible
				if (j > 0)
					left = curr[j - 1];
				// Calculate the number of paths by adding paths from up and from the left
				curr[j] = up + left;
			}
			prev = curr;
		}
		return prev[n - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
