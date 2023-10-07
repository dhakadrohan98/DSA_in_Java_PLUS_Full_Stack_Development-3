package com.kumar.graph;

import java.util.Scanner;

public class NumberOfIslandsDFS { //Through DFS approach using stack
	
	static int[] rows = {1,-1,0,0,-1,-1,1,1};
	static int[] cols = {0,0,1,-1,1,-1,1,-1};
	
	public static void dfs(int row, int col, int[][] grid) {
		grid[row][col] = 0;
		
		for(int direction=0; direction<8; direction++) {
			int newRow = row + rows[direction];
			int newCol = row + cols[direction];
			
			if(newRow < grid.length && newRow >= 0 && newCol < grid[0].length && newCol >= 0 && 
				grid[newRow][newCol] == 1) {
				dfs(newRow, newCol, grid);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		for(int row=0; row<n; row++) {
			for(int col=0; col<m; col++) {
				
				if(grid[row][col] == 1) {
					islands++;
					dfs(row,col,grid);
				}
			}
		}
		System.out.println("Number of islands: "+islands);
	}

}
