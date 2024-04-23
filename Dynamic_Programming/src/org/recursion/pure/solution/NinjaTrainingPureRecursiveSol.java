package org.recursion.pure.solution;

public class NinjaTrainingPureRecursiveSol {
	//TC: O(2^n)
	//SC: O(N) stack space
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
		for (int i = 0; i < 3; i++) { // day = 1, i = 2; arr[1][2]
			if (i != last) {
				int maxPoints = points[day][i] + dfs(day-1, i, points);  //day=0 z, i=0
				System.out.println("Day: " + day + " i: " + i + " maxPoints: " + maxPoints);
				maxi = Math.max(maxi, maxPoints);
			}
		}
		return maxi;
	}
	
	public static void main(String[] args) {
		int n = 4;
		int[][] points = new int[n][];
		points[0] = new int[]{2,1,3};
		points[1] = new int[]{3,4,6};
		points[2] = new int[]{10,1,6};
		points[3] = new int[]{8,3,7};
		
		int ans = ninjaTraining(n, points);
		System.out.println();
		System.out.println(ans);
	}
}
