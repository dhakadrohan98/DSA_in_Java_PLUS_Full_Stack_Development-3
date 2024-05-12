package org.graph.lucky.bhaiyan;

import java.util.*;

public class Zero1Matrix {
	// TC: O(n*m)
	// SC: O(n*m)
	class Node {
		int x;
		int y;
		int steps;

		public Node(int x, int y, int steps) {
			this.x = x;
			this.y = y;
			this.steps = steps;
		}

	}

	private boolean isValid(int row, int col, int[][] grid) {
		return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length;
	}

	public int[][] updateMatrix(int[][] grid) {
		int n = grid.length; // rows
		int m = grid[0].length; // columns
		boolean[][] visited = new boolean[n][m];
		int[][] dist = new int[n][m]; // keep track of nearest distance of cell having 1.
		Queue<Node> q = new LinkedList<>();
		// Initially put all cell's coordinates having 1 into queue with steps 0 & mark
		// them visited.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 0) {
					q.add(new Node(i, j, 0));
					visited[i][j] = true;
				}
			}
		}

		while (!q.isEmpty()) {
			// remove first head of the queue.
			Node temp = q.poll();
			int row = temp.x;
			int col = temp.y;
			int steps = temp.steps;
			// update dist array with head of queue's values
			dist[row][col] = steps;
			// check into four directions
			// up
			if (isValid(row - 1, col, grid) && visited[row - 1][col] == false) {
				visited[row - 1][col] = true;
				q.add(new Node(row - 1, col, steps + 1));
			}
			// right
			if (isValid(row, col + 1, grid) && visited[row][col + 1] == false) {
				visited[row][col + 1] = true;
				q.add(new Node(row, col + 1, steps + 1));
			}
			// down
			if (isValid(row + 1, col, grid) && visited[row + 1][col] == false) {
				visited[row + 1][col] = true;
				q.add(new Node(row + 1, col, steps + 1));
			}
			// left
			if (isValid(row, col - 1, grid) && visited[row][col - 1] == false) {
				visited[row][col - 1] = true;
				q.add(new Node(row, col - 1, steps + 1));
			}
		}
		return dist;
	}
}
