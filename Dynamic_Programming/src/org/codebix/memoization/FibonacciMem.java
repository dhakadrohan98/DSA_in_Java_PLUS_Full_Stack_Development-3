package org.codebix.memoization;

import java.util.Arrays;

public class FibonacciMem {

	public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
    
    public int helper(int n, int[] dp) {
        //base case
        if(n==1 || n==0) {
            return n;
        }
        
        //base case
        if(dp[n] != -1) {
            return dp[n];
        }
        
        int left = helper(n-1, dp);
        int right = helper(n-2, dp);
        dp[n]=left+right;
        return dp[n];
    }
	
	public static void main(String[] args) {
		int num = 5;
		int[] dp = new int[num+1];

	}

}
