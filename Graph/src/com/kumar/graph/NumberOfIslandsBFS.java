package com.kumar.graph;
import java.util.*;

public class NumberOfIslandsBFS {

	static int[] rows = {1,-1,0,0,-1,-1,1,1};
	static int[] cols = {0,0,1,-1,1,-1,1,-1};
	
	public static void main(String[] args) {
		int[][] grid = {
				{0,1,0,1},
				{1,0,1,1},
				{1,0,0,0},
				{0,0,1,0},
				{1,0,0,1}
			   };
		int islands = 0;
		int n = grid.length;
		int m = grid[0].length;
		Queue<Pair> queue = new LinkedList<Pair>();  // Pair<Integer,Integer>
//		queue.add(new Pair(0,2));
//		Pair p = queue.poll();
//		System.out.println(p.first + ","+p.second);
		
		for(int row=0; row<n; row++) {
			for(int col=0; col<m; col++) {
				
				if(grid[row][col] == 1) {
					islands++;
					//initially add row=0,col=1 in queue. Starting adding row,col into queue<Pair> whenever we find its grid value==1.
					queue.add(new Pair(row,col));
					grid[row][col] = 0; //setting added row,col = 0 because we can avoid from visiting the same grid again.
					
					//Repeat algorithm when queue doesn't become empty
					while(!queue.isEmpty()) {
						Pair p = queue.poll();
						int currRow = p.first;
						int currCol = p.second;
						
						for(int direction=0; direction<8; direction++) {
							int newRow = currRow + rows[direction];
							int newCol = currCol + cols[direction];
							
							if(newRow < n && newRow >= 0 && newCol < m && newCol >= 0 && 
							   grid[newRow][newCol] == 1) {
								
								//setting added row,col = 0 because we can avoid from visiting the same grid again.
								grid[newRow][newCol] = 0;
								queue.add(new Pair(newRow,newCol));
							} //if 2nd time
							
						}//for direction
					}//while
					
				} // if 1st time
			} //for col
		} //for row
		
		System.out.println("Number of islands: "+islands);
		

	} //main method

} //class
