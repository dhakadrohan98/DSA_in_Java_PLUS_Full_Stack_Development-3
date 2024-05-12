package org.graph.lucky.bhaiyan;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeAndLadder {
	// TC: O(n^2)
	// SC: O(n^2)
	public int snakesAndLadders(int[][] board) {
		int n = board.length;
		int steps = 0;
		Queue<Integer> q = new LinkedList<>();
		boolean[][] visited = new boolean[n][n];
		q.add(1); // board numbers starting from 1
		visited[n - 1][0] = true;

		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int x = q.poll();
				// if player reached at the top left cells of board then return steps
				if (x == n * n)
					return steps;
				// roll dice with +1,+2,+3,+4,+5,+6 number's possibility
				for (int k = 1; k <= 6; k++) {
					if (k + x > n * n)
						break;
					int[] pos = findCoordinates(k + x, n);
					int r = pos[0];
					int c = pos[1];
					if (visited[r][c] == true) {
						continue;
					}
					visited[r][c] = true;
					if (board[r][c] == -1) {
						q.add(k + x);
					} else {
						q.add(board[r][c]);
					}
				}
			}

			steps++;
		}
		// if not able to reach at top left due to lot 6 different snakes before this
		// cell
		return -1;
	}

	private int[] findCoordinates(int curr, int n) {
		int row = (curr - 1) / n;
		int col = (curr - 1) % n;
		int x = n - 1 - row;
		int y = (row % 2) == 0 ? col : n - 1 - col;

		return new int[] { x, y };
	}
}
