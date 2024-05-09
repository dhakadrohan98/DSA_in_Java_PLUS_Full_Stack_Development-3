package org.graph.lucky.bhaiyan;

public class FloodFill {
	// TC: O(V + E)
	// SC: O(V)
	private void dfs(int[][] image, int row, int col, int newColor, int iniColor) {
		int m = image.length;
		int n = image[0].length;
		// base case
		if (row < 0 || row >= m || col < 0 || col >= n || image[row][col] != iniColor) {
			return;
		}
		// fill connected cells with new color
		image[row][col] = newColor;
		// recursive call
		dfs(image, row - 1, col, newColor, iniColor);
		dfs(image, row, col + 1, newColor, iniColor);
		dfs(image, row + 1, col, newColor, iniColor);
		dfs(image, row, col - 1, newColor, iniColor);
	}

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		// edge case
		if (image[sr][sc] == newColor) {
			return image;
		}
		int iniColor = image[sr][sc];
		// making copy of the given array
		// int[][] ans = image;
		dfs(image, sr, sc, newColor, iniColor);
		return image;
	}
}

// Not modifying original given matrix
//private void dfs(int[][] image, int[][] ans, int row, int col, int newColor, int iniColor) {
//	int m = image.length;
//	int n = image[0].length;
//	//base case
//	if(row < 0 || row >= m || col < 0 || col >= n || image[row][col] !=  iniColor || 
//			ans[row][col] == newColor) 
//	{
//		return;
//	}
//	ans[row][col] = newColor;
//	//recursive call
//	dfs(image, ans, row-1, col, newColor, iniColor);
//	dfs(image, ans, row, col+1, newColor, iniColor);
//	dfs(image, ans, row+1, col, newColor, iniColor);
//	dfs(image, ans, row, col-1, newColor, iniColor);
//}
//
//public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//	int iniColor = image[sr][sc];
//	//making copy of the given array
//	int[][] ans = image;
//	dfs(image, ans, sr, sc, newColor, iniColor);
//	return ans;
//}
