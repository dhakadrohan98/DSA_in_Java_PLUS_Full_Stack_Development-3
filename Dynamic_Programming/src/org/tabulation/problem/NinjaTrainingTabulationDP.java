package org.tabulation.problem;

import java.util.Arrays;

public class NinjaTrainingTabulationDP {
	//TC: O(N * 4 * 3)
	//SC: O(N * 4)
	public static int ninjaTraining(int n, int points[][]) {
		int[][] dp = new int[n][4];
		// taken from base case of recursive solution in modified way
		//last = 0 | 1 | 2 
		//all combination at day 0 like (0,0) (0,1) (0,2) (0,3)
		dp[0][0] = Math.max(points[0][1], points[0][2]);
		dp[0][1] = Math.max(points[0][0], points[0][2]);
		dp[0][2] = Math.max(points[0][0], points[0][1]);
		dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

		for (int day = 1; day < n; day++) { // replacing recursion
			for (int last = 0; last < 4; last++) {
				dp[day][last] = 0; //similar to maxi variable
				for (int task = 0; task < 3; task++) {
					if (task != last) {
						int activity = points[day][task] + dp[day - 1][task];
						dp[day][last] = Math.max(dp[day][last], activity);
					}
				}
			}
		}
		//final results will be at dp[2][3];
		return dp[n - 1][3]; //dp[2][3]
	}

	public static void main(String[] args) {
		int[][] points = { 
						   { 10, 40, 70 }, 
						   { 20, 50, 80 }, 
				           { 30, 60, 90 } 
						 };
		int n = points.length; // Get the number of days
		System.out.println(ninjaTraining(n, points));
	}

}
