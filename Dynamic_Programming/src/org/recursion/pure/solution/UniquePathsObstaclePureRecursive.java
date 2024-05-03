package org.recursion.pure.solution;

public class UniquePathsObstaclePureRecursive {
	//Recursive solution
	// TC: O(2 ^ (m * n))
	// SC: O(m * n) stack space
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		return helper(obstacleGrid, m - 1, n - 1);
	}

	private static int helper(int[][] arr, int m, int n) {
		// base cases
		// include one more base case

		if (m < 0 || n < 0) {
			return 0;
		}
		//if we found obstacle at (m,n) indexes
		if (m >= 0 && n >= 0 && arr[m][n] == 1) {
			return 0;
		}
		if (m == 0 && n == 0) {
			return 1;
		}
		
		int up = helper(arr, m - 1, n);
		int left = helper(arr, m, n - 1);
		return up + left;
	}
	
	public static void main(String[] args) {
		int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int[][] obstacleGrid1 = {{0,1}, {0,0}};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}

}
