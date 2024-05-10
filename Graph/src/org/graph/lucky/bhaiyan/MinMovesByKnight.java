package org.graph.lucky.bhaiyan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MinMovesByKnight {
	class Coordinate {
		int x;
		int y;

		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	public int knightMoves(int N, int M, int x1, int y1, int x2, int y2) {
		// Eight directions of knight moves
		int[] dx = { -1, -2, -1, -2, 1, 2, 1, 2 };
		int[] dy = { -2, -1, 2, 1, -2, -1, 2, 1 };
		boolean[][] isVisited = new boolean[N + 1][M + 1];
		Queue<Coordinate> q = new LinkedList<>();
		q.add(new Coordinate(x1, y1));
		isVisited[x1][y1] = true;
		int moveCount = 0;

		while (!q.isEmpty()) {
			int size = q.size();
			for (int count = 0; count < size; count++) {
				Coordinate currPos = q.poll();
				// if currPos's x & y coordinates are equals to destination coordinates then
				// return moveCount.
				if (currPos.x == x2 && currPos.y == y2) {
					return moveCount;
				}

				// move into eight direction but checks direction validty first
				for (int i = 0; i < 8; i++) {
					int newX = currPos.x + dx[i];
					int newY = currPos.y + dy[i];
					if (isValid(newX, newY, N, M) && isVisited[newX][newY] == false) {
						q.add(new Coordinate(newX, newY));
						isVisited[newX][newY] = true;
					}
				}
			}
			moveCount += 1;
		}
		return -1;
	}

	private boolean isValid(int newX, int newY, int N, int M) {
		if (newX <= 0 && newY <= 0 || newX > N || newY > M) {
			return false;
		}
		return true;
	}
}
