package org.recursion.pure.solution;

public class MinimumPathSumPureRecursiveSol {
	//TC: O(2 ^ (m * n))
	//SC: O(m * n) stack space
	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		return rec(grid, m-1, n-1);
	}

	private int rec(int[][] grid, int i, int j) {
		//base case
		if(i == 0 && j == 0) {
			return grid[0][0];
		}
		
		if(i < 0 || j < 0) {
			return (int) Math.pow(10, 9); // If we're out of bounds, return a large value
		}
		int up = grid[i][j] + rec(grid, i-1, j);
		int down = grid[i][j] + rec(grid, i, j-1);
		return Math.min(up, down);
	}
	
	
}
