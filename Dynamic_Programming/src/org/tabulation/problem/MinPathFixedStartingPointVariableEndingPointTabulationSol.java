package org.tabulation.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Tabulation method
public class MinPathFixedStartingPointVariableEndingPointTabulationSol {
	//TC: O(N^2) nearly N^2 not exactly N^2
	//SC: O(N^2) dp 2D array
	public static int minimumTotal(List<List<Integer>> triangle) {
		int n = triangle.size();
		//create 2-D dp array
		int[][] dp = new int[n][n];
		// base case, store the values of last row into dp[n-1]th row.
		for (int j = 0; j < n; j++) {
			dp[n - 1][j] = triangle.get(n - 1).get(j);
		}

		// Two nested loop will be required
		for (int i = n - 2; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				int down = triangle.get(i).get(j) + dp[i+1][j]; //next row, same column
				int diagonal = triangle.get(i).get(j) + dp[i+1][j+1]; //next row, next column
				dp[i][j] = Math.min(down, diagonal);
			}
		}
		//printing dp array
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		return dp[0][0];
	}
	
	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row numbers");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			triangle.add(new ArrayList<>());
		}
		System.out.println("Enter elements ");
		for(int i=0; i<n; i++) {
			List<Integer> temp = triangle.get(i);
			for(int j=0; j<=i; j++) {
				int num = sc.nextInt();
				temp.add(num);
			}
		}
		System.out.println(triangle);
		System.out.println("minimum path sum:-");
		System.out.println(minimumTotal(triangle));
	}
}

//Enter row numbers
//4
//Enter elements 
//2
//3 4
//6 5 7
//4 1 8 3
//[[2], [3, 4], [6, 5, 7], [4, 1, 8, 3]]
