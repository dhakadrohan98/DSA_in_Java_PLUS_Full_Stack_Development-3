package org.graph.lucky.bhaiyan;

public class SurroundedRegions {

	private void dfs(int row, int col, boolean[][] visited, char[][] mat, int[] delrow, int[] delcol) {
		// mark visit to the current cell
		visited[row][col] = true;
		int n = mat.length;
		int m = mat[0].length;
		// check for top, right, bottom, left
		for (int i = 0; i < 4; i++) {
			int nrow = row + delrow[i];
			int ncol = col + delcol[i];
			// check for valid coordinates and unvisited O's
			if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == false
					&& mat[nrow][ncol] == 'O') {
				// recursive call on adjacent cells with value O
				dfs(nrow, ncol, visited, mat, delrow, delcol);
			}
		}
	}

	public void solve(char[][] mat) {
		int n = mat.length; // n rows
		int m = mat[0].length; // m columns
		int[] delrow = { -1, 0, +1, 0 }; // up right down left
		int[] delcol = { 0, +1, 0, -1 }; // up right down left
		boolean[][] visited = new boolean[n][m];
		// traverse first row and last row
		for (int j = 0; j < m; j++) {
			// check for unvisited Os in the boundary rows
			// first row
			if (visited[0][j] == false && mat[0][j] == 'O') {
				dfs(0, j, visited, mat, delrow, delcol);
			}

			// first row
			if (visited[n - 1][j] == false && mat[n - 1][j] == 'O') {
				dfs(n - 1, j, visited, mat, delrow, delcol);
			}
		}

		for (int i = 0; i < n; i++) {
			// check for unvisited Os in the boundary columns
			// first column
			if (!visited[i][0] && mat[i][0] == 'O') {
				dfs(i, 0, visited, mat, delrow, delcol);
			}

			// last column
			if (!visited[i][m - 1] && mat[i][m - 1] == 'O') {
				dfs(i, m - 1, visited, mat, delrow, delcol);
			}
		}

		// if unvisited O then convert to X
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (visited[i][j] == false && mat[i][j] == 'O')
					mat[i][j] = 'X';
			}
		}
	}
}
