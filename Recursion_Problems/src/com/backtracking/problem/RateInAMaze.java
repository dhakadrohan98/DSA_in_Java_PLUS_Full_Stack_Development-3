package com.backtracking.problem;

public class RateInAMaze {
	
	private static void printPathHelper(int i, int j, int[][] arr, String str) {
		// TODO Auto-generated method stub
		if(i == 0 && j == 0) {
			StringBuilder sb = new StringBuilder(str);
			System.out.println(sb.reverse());
			return;
		}
		
		//up
		if(isValid(i-1, j, arr) && arr[i-1][j] == 1) {
			str += 'D';
			printPathHelper(i-1, j, arr, str);
			//remove D from str
			str = str.substring(0, str.length()-1);
		}
		//left
		if(isValid(i, j-1, arr) && arr[i][j-1] == 1) {
			str += 'R';
			printPathHelper(i, j-1, arr, str);
			//remove R from str
			str = str.substring(0, str.length()-1);
		}
		
	}
	
	private static boolean isValid(int i, int j, int[][] arr) {
		return i>=0 && j>=0 && i<arr.length && j<arr.length;
	}

	public static void main(String[] args) {
		int arr[][] = { 
				{ 1, 0, 0, 0}, 
				{ 1, 1, 0, 0}, 
				{ 1, 1, 1, 0}, 
				{ 0, 0, 1, 1}
			    };
		int m = arr.length;
		int n = arr[0].length;
		
		printPathHelper(m-1, n-1,arr,"");

	}

}
