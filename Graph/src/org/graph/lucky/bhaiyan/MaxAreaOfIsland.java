package org.graph.lucky.bhaiyan;

public class MaxAreaOfIsland {
	//TC: O(M*N)
	//SC: O(M*N)
	public int maxAreaOfIsland(int[][] grid) {
		if (grid.length == 0)
			return 0;

		int numOfIslands = 0;
		int maxArea = 0;
		int r = grid.length;
		int c = grid[0].length;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				// first node of new component will be passed through if condition
				if (grid[i][j] == 1) {
					// pass by reference instead of pass by value
					int[] count = new int[1];
					int islandSize = DFS(grid, i, j, count);
					maxArea = Math.max(maxArea, islandSize);
				}
			}
		}
		return maxArea;
	}

	private static int DFS(int grid[][], int i, int j, int[] count) {
		int r = grid.length;
		int c = grid[0].length;
		// base case
		if (i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == 0)
			return 0;

		count[0] += 1;
		// converting that land into water instead of taking visited array as Auxiliary
		// space
		// Mark the cell as visited
		grid[i][j] = 0;

		// Explore in four directions
		// travel into four directions
		DFS(grid, i + 1, j, count); // down
		DFS(grid, i, j + 1, count); // right
		DFS(grid, i - 1, j, count); // up
		DFS(grid, i, j - 1, count); // left
		// size = down + right + up + left;

		return count[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
