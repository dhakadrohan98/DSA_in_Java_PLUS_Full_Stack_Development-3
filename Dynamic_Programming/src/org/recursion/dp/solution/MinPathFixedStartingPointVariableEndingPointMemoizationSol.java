package org.recursion.dp.solution;

import java.util.Arrays;
import java.util.List;

public class MinPathFixedStartingPointVariableEndingPointMemoizationSol {
	//TC: O(n*n)
	//SC: O(n) recursion stack space + O(n^2) for dp array
	public int minimumTotal(List<List<Integer>> triangle) {
		int size = triangle.size();
		int[][] dp = new int[size][size];
		for (int[] temp : dp) {
			Arrays.fill(temp, -1);
		}
		return helper(0, 0, triangle, dp, size);
	}

	private static int helper(int i, int j, List<List<Integer>> triangle, int[][] dp, int n) {
		// base cases
		if (i == n - 1)
			return triangle.get(n - 1).get(j);
		if (dp[i][j] != -1)
			return dp[i][j];

		int down = triangle.get(i).get(j) + helper(i + 1, j, triangle, dp, n);
		int diagonalRightBottom = triangle.get(i).get(j) + helper(i + 1, j + 1, triangle, dp, n);
		return dp[i][j] = Math.min(down, diagonalRightBottom);
	}
}
