package org.space.optimizationsolution;

public class HouseRobberSpaceOptimisation {
	// TC: O(N)
	// SC: O(1)
	public int rob(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		// base cases of recursive approach
		int prev = nums[0];
		int prev2 = 0; // for (indx - 2) condition

		for (int i = 1; i < n; i++) {
			int take = nums[i];
			if (i > 1) {
				take += prev2;
			}
			int nonTake = 0 + prev;
			int curri = Math.max(take, nonTake);
			prev2 = prev;
			prev = curri;
		}

		return prev;
	}
}
