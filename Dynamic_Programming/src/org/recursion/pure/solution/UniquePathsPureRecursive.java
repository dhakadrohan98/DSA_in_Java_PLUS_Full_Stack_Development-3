package org.recursion.pure.solution;

import java.util.*;

public class UniquePathsPureRecursive {
	//Recursive solution
	//TC: O(2^ (m*n))
    //SC: O(m * n) stack space
	public static int uniquePaths(int m, int n) {
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++) {
		       Arrays.fill(arr[i],1);
		    }
		return dfs(arr, m-1, n-1);
	}
	
	private static int dfs(int[][] arr, int m, int n) {
		//two base cases
		if(m < 0 || n < 0) return 0;
		if(m == 0 && n == 0) {
			return 1;
		}
					 // up           + //left
		int total = dfs(arr, m-1, n) + dfs(arr, m, n-1);
		return total;
	}
	
	public static void main(String[] args) {
		int m = 3;
		int n = 7;
		System.out.println(uniquePaths(m, n));
	}
}
