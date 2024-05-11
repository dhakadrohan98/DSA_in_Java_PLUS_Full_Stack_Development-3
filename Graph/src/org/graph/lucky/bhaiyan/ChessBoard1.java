package org.graph.lucky.bhaiyan;

import java.util.*;

public class ChessBoard1 {

	class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	
	public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N) {
		int x1 = KnightPos[0];
		int y1 = KnightPos[1];
		int x2 = TargetPos[0];
		int y2 = TargetPos[1];
		//edge case
		if(x1 == x2 && y1 == y2) {
			return 0;
		}
		int[] dx = {-2, -2, -1, 1, 2, 2, 1, -1};
		int[] dy = {-1, 1, 2, 2, 1, -1, -2, -2};
		boolean[][] visited = new boolean[N][N];
		int movesCount = 0;
		
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x1, y1));
		visited[x1][y1] = true;
		while(!q.isEmpty()) {
			int size = q.size();
			
			for(int k=0; k<size; k++) {
				Pair p = q.poll();
				int i = p.x;
				int j = p.y;
				
				for(int pair=0; pair <8; pair++) {
					if(isValid(i+dx[pair], j+dy[pair], visited)) {
						q.add(new Pair(i+dx[pair], j+dy[pair]));
						visited[i+dx[pair]][j+dy[pair]] = true;
						movesCount++;
					}
				}
			}
		}
		return -1;
	}
	
	private boolean isValid(int i, int j, boolean[][] visited) {
		return i >= 0 && i < visited.length && j >= 0 && j < visited[0].length;
	}

}
