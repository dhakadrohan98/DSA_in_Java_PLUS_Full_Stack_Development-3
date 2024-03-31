package com.recusrion.striver;

import java.util.*;

public class NQueenPuzzle {

	public static List<List<String>> solveNQueens(int n) {
		char[][] board = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}
		List<List<String>> ans = new ArrayList<>();
		int[] leftRow = new int[n];
		int[] upperDiagonal = new int[(2 * n) - 1];
		int[] lowerDiagonal = new int[(2 * n) - 1];
		int col = 0;
		solve(col, board, ans, leftRow, lowerDiagonal, upperDiagonal);
		return ans;
	}

	private static void solve(int col, char[][] board, List<List<String>> ans, int[] leftRow, int[] lowerDiagonal,
			int[] upperDiagonal) {
		int n = board.length;
		// base case
		if (col == n) {
			ans.add(construct(board));
			return;
		}

		for (int row = 0; row < n; row++) {
			if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[(n - 1) + (col - row)] == 0) {
				board[row][col] = 'Q';
				leftRow[row] = 1;
				lowerDiagonal[row + col] = 1;
				upperDiagonal[(n - 1) + (col - row)] = 1;
				solve(col + 1, board, ans, leftRow, lowerDiagonal, upperDiagonal);
				// after recursion call over & backtracking starts
				board[row][col] = '.';
				leftRow[row] = 0;
				lowerDiagonal[row + col] = 0;
				upperDiagonal[(n - 1) + (col - row)] = 0;
			}
		}
	}

	// constructing string from char array & storing it into ArrayList
	private static List<String> construct(char[][] board) {
		List<String> resList = new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			String s = new String(board[i]);
			resList.add(s);
		}
		return resList;
	}

	public static void main(String args[]) {
		int N = 4;
		List<List<String>> queen = solveNQueens(N);
		int i = 1;
		for (List<String> it : queen) {
			System.out.println("Arrangement " + i);
			for (String s : it) {
				System.out.println(s);
			}
			System.out.println();
			i += 1;
		}

	}

}
