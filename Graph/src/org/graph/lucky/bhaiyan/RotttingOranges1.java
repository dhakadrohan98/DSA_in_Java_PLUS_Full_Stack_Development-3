package org.graph.lucky.bhaiyan;

import java.util.LinkedList;
import java.util.Queue;

public class RotttingOranges1 {
	class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public int orangesRotting(int[][] grid) {
		int rotten = 0, total = 0;
		int time = 0;
		Queue<Pair> q = new LinkedList<>();
        

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1 || grid[i][j] == 2) {
					total++;
				}
				if (grid[i][j] == 2) {
					q.offer(new Pair(i, j));
				}
			}
		}
        
        if(total == 0) return 0;

		while (!q.isEmpty()) {
			int size = q.size();
            rotten = rotten + size;
            if (rotten == total) {
				return time;
			}
            
			for (int k = 0; k < size; k++) {
                Pair p = q.poll();
                int i = p.x;
                int j = p.y;
				// four directions
				// up
				if (isValid(i - 1, j, grid) && grid[i - 1][j] == 1) {
					q.add(new Pair(i - 1, j));
					grid[i - 1][j] = 2;
				}
				// right
				if (isValid(i, j + 1, grid) && grid[i][j + 1] == 1) {
					q.add(new Pair(i, j + 1));
					grid[i][j + 1] = 2;
				}
				// down
				if (isValid(i + 1, j, grid) && grid[i + 1][j] == 1) {
					q.add(new Pair(i + 1, j));
					grid[i + 1][j] = 2;
				}
				// left
				if (isValid(i, j - 1, grid) && grid[i][j - 1] == 1) {
					q.add(new Pair(i, j - 1));
					grid[i][j - 1] = 2;
				}
			}
			time++;
		}
		return -1;
	}

	private boolean isValid(int i, int j, int[][] grid) {
		return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length;
	}
}
