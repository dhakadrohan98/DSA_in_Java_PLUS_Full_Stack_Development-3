package org.graph.lucky.bhaiyan;

import java.util.*;

public class StepsByKnightGFG {
	class Coordinate {
		int x;
		int y;

		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}
	
	private boolean isValid(int newX, int newY, int N) {
	    return newX >= 1 && newY >= 1 && newX <= N && newY <= N;
	}
	
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        int x1 = KnightPos[0];
        int y1 = KnightPos[1];
        int x2 = TargetPos[0];
        int y2 = TargetPos[1];
        // Eight directions of knight moves
		int[] dx = { -1, -2, -1, -2, 1, 2, 1, 2 };
		int[] dy = { -2, -1, 2, 1, -2, -1, 2, 1 };
		boolean[][] isVisited = new boolean[N + 1][N + 1];
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
					if (isValid(newX, newY, N) && isVisited[newX][newY] == false) {
						q.add(new Coordinate(newX, newY));
						isVisited[newX][newY] = true;
					}
				}
			}
			moveCount += 1;
		}
		return -1;
    }
}
