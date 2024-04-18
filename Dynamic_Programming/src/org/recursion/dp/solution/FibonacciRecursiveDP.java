package org.recursion.dp.solution;

import java.util.Arrays;

public class FibonacciRecursiveDP {
	// recursion - Top down
	public static int fib(int num, int[] dp) {
		// Two base cases
		if (num <= 1) {
			return num;
		}

		if (dp[num] != -1) {
			return dp[num];
		}

		System.out.println("num - " + num + " DP - " + dp[num]);

		dp[num] = fib(num - 1, dp) + fib(num - 2, dp);
		return dp[num];
	}

	public static void main(String[] args) {
		int num = 8;
		int[] dp = new int[num + 1];
		Arrays.fill(dp, -1);
		for (int val : dp) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println(fib(num, dp));

	}
}
