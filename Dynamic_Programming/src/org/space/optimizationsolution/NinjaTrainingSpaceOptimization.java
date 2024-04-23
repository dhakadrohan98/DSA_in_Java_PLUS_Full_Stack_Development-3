package org.space.optimizationsolution;

public class NinjaTrainingSpaceOptimization {
	//TC: O(N * 4 * 3)
	//SC: O(4) constant space
	public static int ninjaTraining(int n, int points[][]) {
		int[] prev = new int[4];
		// taken from base case of recursive solution in modified way
		prev[0] = Math.max(points[0][1], points[0][2]);
		prev[1] = Math.max(points[0][0], points[0][2]);
		prev[2] = Math.max(points[0][0], points[0][1]);
		prev[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));
		
		for (int day = 1; day < n; day++) { 
			//temp array to store current one's day activities 
			int[] temp = new int[4];
			for (int last = 0; last < 4; last++) {
				temp[last] = 0;
				for (int task = 0; task < 3; task++) {
					if (task != last) {
						int activity = points[day][task] + prev[task];
						temp[last] = Math.max(temp[last], activity);
					}
				}
			}
			//let's store current temp arr values into prev array
			prev = temp;
		}
		return prev[3];
	}
}
