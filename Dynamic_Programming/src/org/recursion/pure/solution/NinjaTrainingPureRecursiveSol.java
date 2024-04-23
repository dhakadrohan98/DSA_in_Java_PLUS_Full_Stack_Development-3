package org.recursion.pure.solution;

public class NinjaTrainingPureRecursiveSol {
	public static int ninjaTraining(int n, int points[][]) {
		return dfs(n - 1, 3, points);
	}

	private static int dfs(int day, int last, int[][] points) {
		// base case
		if (day == 0) {
			int maxi = Integer.MIN_VALUE;
			for (int i = 0; i < 3; i++) {
				if (i != last) {
					maxi = Math.max(maxi, points[day][i]);
				}
			}
			return maxi;
		}
		// caculating for n-1,n-2,......,1 indexes
		int maxi = Integer.MIN_VALUE;
		for (int i = 0; i < 3; i++) {
			if (i != last) {
				int maxPoints = points[day][i] + dfs(day-1, i, points);
				maxi = Math.max(maxi, maxPoints);
			}
		}
		return maxi;
	}
}
