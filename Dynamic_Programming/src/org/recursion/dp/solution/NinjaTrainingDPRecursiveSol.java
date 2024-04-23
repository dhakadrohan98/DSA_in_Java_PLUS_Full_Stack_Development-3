package org.recursion.dp.solution;

import java.util.Arrays;

public class NinjaTrainingDPRecursiveSol {
	// TC: O(N * 4) * 3
	// SC: O(N) stack space + O(N * 4) storage array of dp

	public static int ninjaTraining(int n, int points[][]) {
		int[][] dp = new int[n][4];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}
		return dfs(n - 1, 3, points, dp);
	}

	private static int dfs(int day, int last, int[][] points, int[][] dp) {
		// Two base cases
		// one for dp & other when day = 0;
		if (dp[day][last] != -1) {
			return dp[day][last];
		}

		if (day == 0) {
			int maxi = 0;
			for (int i = 0; i < 3; i++) {
				if (i != last) {
					maxi = Math.max(maxi, points[day][i]);
				}
			}
			return dp[day][last] = maxi;
		}

		//day = 1,2,..,n-1 
		// caculating for n-1,n-2,......,1 indexes
		int maxi = 0;
		for (int i = 0; i < 3; i++) {
			if (i != last) {
				int maxPoints = points[day][i] + dfs(day - 1, i, points, dp);
				maxi = Math.max(maxi, maxPoints);
			}
		}
		return dp[day][last] = maxi;
	}

	public static void main(String[] args) {
		int n = 4;
		int[][] points = new int[n][];
		points[0] = new int[] { 2, 1, 3 };
		points[1] = new int[] { 3, 4, 6 };
		points[2] = new int[] { 10, 1, 6 };
		points[3] = new int[] { 8, 3, 7 };

		int ans = ninjaTraining(n, points);
		System.out.println("Final ans: " + ans);
	}
}
