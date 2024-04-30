package com.recusrion.striver;

import java.util.*;

public class RateInAMaze {
	//TC: O(4 ^ (m*n))
	//SC: O(m * n) auxiliary space
	private static void solve(int i, int j, int matrix[][], int n, ArrayList<String> ans, String move,
			boolean visited[][]) {

		// base case if i and j both equals to n-1, add all moves into ArrayList<String>
		// ans ^ return.
		if (i == n - 1 && j == n - 1) {
			ans.add(move);
			return;
		}

		// downward
		if (i + 1 < n && visited[i + 1][j] == false && matrix[i + 1][j] == 1) {
			visited[i][j] = true;
			solve(i + 1, j, matrix, n, ans, move + 'D', visited);
			visited[i][j] = false;
		}

		// left
		if (j - 1 >= 0 && visited[i][j - 1] == false && matrix[i][j - 1] == 1) {
			visited[i][j] = true;
			solve(i, j - 1, matrix, n, ans, move + 'L', visited);
			visited[i][j] = false;
		}

		// right
		if (j + 1 < n && visited[i][j + 1] == false && matrix[i][j + 1] == 1) {
			visited[i][j] = true;
			solve(i, j + 1, matrix, n, ans, move + 'R', visited);
			visited[i][j] = false;
		}

		// upward
		if (i - 1 >= 0 && visited[i - 1][j] == false && matrix[i - 1][j] == 1) {
			visited[i][j] = true;
			solve(i - 1, j, matrix, n, ans, move + 'U', visited);
			visited[i][j] = false;
		}
	}

	public static ArrayList<String> findPath(int[][] matrix, int n) {
		boolean visited[][] = new boolean[n][n];
		ArrayList<String> ans = new ArrayList<>();
		//If the source cell is 0, the rat cannot move to any other cell.
		if (matrix[0][0] == 1) {
			solve(0, 0, matrix, n, ans, "", visited);
		}	
		return ans;
	}

	public static void main(String[] args) {
	    int[][] matrix = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
	    int n = matrix.length;
	    ArrayList<String> ans = findPath(matrix, n);
	    for(String str: ans) {
	    	System.out.println(str);
	    }
	}

}
