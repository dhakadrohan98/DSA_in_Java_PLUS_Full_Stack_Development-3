package org.leetcodemedium.arr.revision;

public class RotateImageBy90Degree {

	// TC: O(n*n-1)
	// SC: O(1)
	public static void rotate(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		// Find transpose of a matrix
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				swap(mat, i, j);
			}
		}
		// print transpose
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.print(mat[i][j] + " ");
//			}
//			System.out.println();
//		}

		// reverse each row of transpose matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m / 2; j++) {
				// swap for reversing the row
				int temp = mat[i][j];
				mat[i][j] = mat[i][m - 1 - j];
				mat[i][m - 1 - j] = temp;
			}
		}
	}

	private static void swap(int[][] mat, int i, int j) {
		int temp = mat[i][j];
		mat[i][j] = mat[j][i];
		mat[j][i] = temp;
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(mat);
		int n = mat.length;
		int m = mat[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
