package org.recursion.dp.solution;

import java.util.Arrays;

public class UniquePathsDPRecursiveSol {
	//TC: O(m*n)
    //SC: O(m * n) stack space + O(m * n) dp array
	public static int uniquePaths(int m, int n) {
		int[][] dp = new int[m][n];
		for(int i=0; i<m; i++) {
		       Arrays.fill(dp[i],-1);
		}
		return dfs(dp, m-1, n-1);
	}
	
	private static int dfs(int[][] dp, int m, int n) {
		//base cases
        if(m < 0 || n < 0) return 0;
        if(m == 0 && n == 0) {
			return 1;
		}
        if(dp[m][n] != -1) {
            return dp[m][n];
        }
		
	    dp[m][n] = dfs(dp, m-1, n) + dfs(dp, m, n-1);
		return dp[m][n];
	}
}
