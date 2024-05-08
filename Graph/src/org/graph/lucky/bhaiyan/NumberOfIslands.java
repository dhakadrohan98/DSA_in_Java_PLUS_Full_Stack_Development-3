package org.graph.lucky.bhaiyan;

public class NumberOfIslands {
	// TC: O(m*n)
	// SC: O(max area of land)
	public int numIslands(char[][] grid) {
		if (grid.length == 0)
			return 0;
		int numOfIslands = 0;
		// keep track of maximum area of land
		int max = 0;
		int r = grid.length;
		int c = grid[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int noOfNodes = 0;
				if (grid[i][j] == '1') { // if there is a land then apply DFS for first time & its adjacent nodes
					noOfNodes++;
					DFS(grid, i, j, noOfNodes);
					// keep track of maximum area of land
					max = Math.max(max, noOfNodes);
					// keep track of no. of islands.
					numOfIslands++;
				}
			}
		}
		return numOfIslands;
	}

	private static void DFS(char grid[][], int i, int j, int noOfNodes) {
		int r = grid.length;
		int c = grid[0].length;
		// base case
		if (i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == '0')
			return;

		noOfNodes++;
		// converting that land into water, instead of taking visited array as Auxiliary space
		// Mark the cell as visited
		grid[i][j] = '0';
		// travel into four directions
		DFS(grid, i + 1, j, noOfNodes); // down
		DFS(grid, i, j + 1, noOfNodes); // right
		DFS(grid, i - 1, j, noOfNodes); // left
		DFS(grid, i, j - 1, noOfNodes); // up
	}
}
