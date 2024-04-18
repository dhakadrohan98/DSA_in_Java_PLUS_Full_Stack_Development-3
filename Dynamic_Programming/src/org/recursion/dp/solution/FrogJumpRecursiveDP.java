package org.recursion.dp.solution;

import java.util.Arrays;

public class FrogJumpRecursiveDP {
	//TC: O(n)
	//SC: O(n) stack space + O(n) storage to memorization
	public static int frogJump(int n, int heights[]) {
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		int ans = fuc(n - 1, heights, dp);
		return ans;
	}

	public static int fuc(int indx, int[] heights, int[] dp) {
		// Two base cases
		if (indx == 0)
			return 0;

		if (dp[indx] != -1)
			return dp[indx];

		int left = fuc(indx - 1, heights, dp) + Math.abs(heights[indx] - heights[indx - 1]);
		int right = Integer.MAX_VALUE;
		if (indx > 1) { // because if indx = 1 then (indx - 2) = -1 (invalid index exception will occur)
			right = fuc(indx - 2, heights, dp) + Math.abs(heights[indx] - heights[indx - 2]);
		}

		dp[indx] = Math.min(left, right);
		return dp[indx];
	}

	public static void main(String[] args) {
		int[] heights = { 10, 20, 30, 10 };
		System.out.println(frogJump(heights.length, heights));

	}

}

//Time limit exceeds on code studio of coding ninja because below one is simple recursive solution

//static int min = Integer.MAX_VALUE;
//
//public static int frogJump(int n, int heights[]) {
//	int ans = fuc(n - 1, heights);
//	return ans;
//}
//
//public static int fuc(int indx, int heights[]) {
//	// base case
//	if (indx == 0)
//		return 0;
//
//	int left = fuc(indx - 1, heights) + Math.abs(heights[indx] - heights[indx - 1]);
//	int right = Integer.MAX_VALUE;
//	if (indx > 1) { // because if indx = 1 then (indx - 2) = -1 (invalid index exception will occur)
//		right = fuc(indx - 2, heights) + Math.abs(heights[indx] - heights[indx - 2]);
//	}
//
//	min = Math.min(left, right);
//	return min;
//}
