package org.graph.lucky.bhaiyan;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

	public class Pair {

		public int x;
		public int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	public int orangesRotting(int[][] grid) {
		Queue<Pair> q = new LinkedList<>();
		int total = 0, rotten = 0, time = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1 || grid[i][j] == 2)
					total++;
				// keep coordinates of all rotten oranges.
				if (grid[i][j] == 2) {
					q.offer(new Pair(i, j));
				}
			}
		}

		// no oranges found
		if (total == 0)
			return 0;
		// perform BFS traversal on each grid having a fresh orange connected to rotten
		// oranges.
		while (!q.isEmpty()) {
			int size = q.size();
			rotten = rotten + size;
			if (rotten == total) {
				return time;
			}

			time++;

			for (int k = 0; k < size; k++) {
				Pair p = q.poll();
				int i = p.x;
				int j = p.y;
				// check into four directions up, right, down, left
				if (i - 1 >= 0 && grid[i - 1][j] == 1) {
					grid[i - 1][j] = 2;
					q.offer(new Pair(i - 1, j));
				}
				if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
					grid[i][j + 1] = 2;
					q.offer(new Pair(i, j + 1));
				}
				if (i + 1 < grid.length && grid[i + 1][j] == 1) {
					grid[i + 1][j] = 2;
					q.offer(new Pair(i + 1, j));
				}
				if (j - 1 >= 0 && grid[i][j - 1] == 1) {
					grid[i][j - 1] = 2;
					q.offer(new Pair(i, j - 1));
				}
			} // for loop ending
		} // while loop ending
		if (total == rotten) {
			return time;
		} else {
			return -1;
		}
	}
}
