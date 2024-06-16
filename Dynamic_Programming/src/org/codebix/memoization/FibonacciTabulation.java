package org.codebix.memoization;

public class FibonacciTabulation {
	public int fib(int n) {
        int[] dp = new int[n+1];
        //base case
        dp[0] = 0;
        //edge case
        if(dp.length == 1) {
            return dp[0];    
        }
        dp[1] = 1;
        
        for(int i=2; i<dp.length; i++) {
        	dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
