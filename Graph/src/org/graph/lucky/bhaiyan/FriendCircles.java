package org.graph.lucky.bhaiyan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FriendCircles {
	public static int friendCirclesCount(int[][] grid) {
		int count = BFS(grid, 0);
		return count;
	}

	private static int BFS(int[][] grid, int count) {
		int v = grid.length;
		boolean[] visited = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (visited[i] == false) {
				// apply bfs on a new unvisited component
				count++;
				bfsHelper(grid, i, visited);
			}
		}
		return count;
	}

	private static void bfsHelper(int[][] grid, int sv, boolean[] visited) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(sv);
		visited[sv] = true;
		int v = grid.length;
		while (!q.isEmpty()) {
			int front = q.poll();
			for (int i = 0; i < v; i++) {
				if (grid[front][i] == 1 && visited[i] == false) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
