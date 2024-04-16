package org.easy.problem;

public class FibonacciDP {

	private static int fib(int num, int[] dp) {
		// Two base cases
		if (num <= 1) {
			return num;
		}
		
		if(dp[num] != 0) {
			return dp[num];
		}
			
		dp[num] = fib(num-1, dp) + fib(num-2, dp);
		System.out.println("num - " + num + " DP - " + dp[num]);
		return dp[num];
	}

	public static void main(String[] args) {
		int num = 8;
		int[] dp = new int[num + 1];
		System.out.println(fib(num, dp));

	}

}
