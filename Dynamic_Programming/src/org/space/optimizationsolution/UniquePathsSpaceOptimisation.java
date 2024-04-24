package org.space.optimizationsolution;

public class UniquePathsSpaceOptimisation {
	// Space optimised solution
	// TC: O(m * n)
	// SC: O(n)
	public static int uniquePaths(int m, int n) {
		// Create an array to store the results for the previous row
		int prev[] = new int[n];

		for (int i = 0; i < m; i++) {
			// Create a temporary array to store the results for the current row
			int temp[] = new int[n];

			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) {
					// Base condition: There's one way to reach the top-left cell (0, 0)
					temp[j] = 1;
					continue;
				}
				int up = 0;
				int left = 0;
				// Calculate the number of ways by moving up (if possible)
				if (i > 0)
					up = prev[j];
				// and left (if possible)
				if (j > 0)
					left = temp[j - 1];
				// Store the total number of ways to reach the current cell in the temporary array
				temp[j] = up + left;
			}
			// Set the temporary array as the previous array for the next row
			prev = temp;
		}
		// Return the number of ways to reach the bottom-right cell (m-1, n-1)
		return prev[n - 1];
	}
}
