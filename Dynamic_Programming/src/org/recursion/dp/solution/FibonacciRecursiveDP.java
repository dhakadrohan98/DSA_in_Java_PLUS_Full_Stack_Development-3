package org.recursion.dp.solution;

import java.util.Arrays;

public class FibonacciRecursiveDP {
	// recursion - Top down
	public static int fib(int indx, int[] dp) {
		// Two base cases
		if (indx <= 1) {
			return indx;
		}

		if (dp[indx] != -1) {
			return dp[indx];
		}
		dp[indx] = fib(indx - 1, dp) + fib(indx - 2, dp);
		System.out.println("num - " + indx + " DP - " + dp[indx]);
		return dp[indx];
	}

	public static void main(String[] args) {
		int num = 8;
		int[] dp = new int[num + 1];
		Arrays.fill(dp, -1);
//		for (int val : dp) {
//			System.out.print(val + " ");
//		}
		System.out.println();
		System.out.println(fib(num-1, dp));

	}
}
