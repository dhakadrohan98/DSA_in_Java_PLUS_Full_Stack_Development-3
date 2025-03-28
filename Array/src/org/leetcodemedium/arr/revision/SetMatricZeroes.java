package org.leetcodemedium.arr.revision;

public class SetMatricZeroes {

	// TC: O(m*n*(m+n))
	// SC: O(m*n*)
	public void setZeroes(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		int[][] copy = new int[n][m];
		// copy original matrix into another matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				copy[i][j] = matrix[i][j];
			}
		}
		// iterate through copy matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (copy[i][j] == 0) {
					// set current col elements zero in original matrix
					int row = i;
					// set zeroes in upward direction
					while (row >= 0) {
						matrix[row][j] = 0;
						row--;
					}
					// reset row to current i
					row = i;
					// set zeroes in downward direction
					while (row <= n - 1) {
						matrix[row][j] = 0;
						row++;
					}
					// set current col elements zero in original matrix
					int col = j;
					// set zeroes in upward direction
					while (col >= 0) {
						matrix[i][col] = 0;
						col--;
					}
					// reset col to current j
					col = j;
					// set zeroes in downward direction
					while (col <= m - 1) {
						matrix[i][col] = 0;
						col++;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
