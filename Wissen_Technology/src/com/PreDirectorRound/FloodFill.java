package com.PreDirectorRound;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
	// TC: O(m*n)
	// SC: O(m*n)
	class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public boolean isValid(int x, int y, int[][] mat) {
		return x >= 0 && y >= 0 && x < mat.length && y < mat[0].length;
	}

	public int[][] floodFill(int[][] mat, int sr, int sc, int color) {
		// base case
		if (mat[sr][sc] == color) {
			return mat;
		}
		Queue<Pair> q = new LinkedList<>();
		int m = mat.length; // rows
		int n = mat[0].length; // columns
		int iniColor = mat[sr][sc];
		mat[sr][sc] = color;
		q.offer(new Pair(sr, sc));

		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				Pair temp = q.poll();
				int x = temp.x;
				int y = temp.y;
				// go into four direction
				// up
				if (isValid(x - 1, y, mat) && mat[x - 1][y] == iniColor) {
					mat[x - 1][y] = color;
					q.offer(new Pair(x - 1, y));
				}
				// right
				if (isValid(x, y + 1, mat) && mat[x][y + 1] == iniColor) {
					mat[x][y + 1] = color;
					q.offer(new Pair(x, y + 1));
				}
				// down
				if (isValid(x + 1, y, mat) && mat[x + 1][y] == iniColor) {
					mat[x + 1][y] = color;
					q.offer(new Pair(x + 1, y));
				}
				// left
				if (isValid(x, y - 1, mat) && mat[x][y - 1] == iniColor) {
					mat[x][y - 1] = color;
					q.offer(new Pair(x, y - 1));
				}

			}
		}
		return mat;
	}
}
