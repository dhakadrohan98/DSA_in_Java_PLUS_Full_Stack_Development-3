package org.dsa.problems;

import java.util.*;

public class WaysToMakeCoinChange {

	public static long count(int[] coins, int n, int target) {
		long dp[][] = new long[n][target + 1];
		for (long[] temp : dp) {
			Arrays.fill(temp, -1);
		}
		return helper(coins, dp, n - 1, target);
	}

	private static long helper(int[] coins, long[][] dp, int indx, int target) {
		// base case
		if (indx == 0) {
			if (target % coins[indx] == 0) {
				return 1;
			} else {
				return 0;
			}
		}

		if (dp[indx][target] != -1)
			return dp[indx][target];

		long take = 0;
		if (coins[indx] <= target) {
			//keep indx constant to consider same element again & again.Reduce the target to stop 
			//considering same element.
			take = helper(coins, dp, indx, target - coins[indx]);
		}
		long notTake = helper(coins, dp, indx - 1, target);
		return dp[indx][target] = take + notTake;
	}

	public static void main(String[] args) {
		int[] coins = {1,2,3};
		int target = 4;
		System.out.println(count(coins, coins.length, target));

	}

}
