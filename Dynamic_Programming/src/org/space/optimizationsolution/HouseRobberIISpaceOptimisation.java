package org.space.optimizationsolution;

public class HouseRobberIISpaceOptimisation {
	// TC: O(N)
	// SC: O(N)temp1 + O(N)temp2
	public int rob(int[] nums) {
		int n = nums.length;
		// base case
		if (n == 1) {
			return nums[0];
		}
		int[] temp1 = new int[n];
		int[] temp2 = new int[n];

		for (int i = 0; i < n; i++) {
			// Do not consider the first element
			if (i != 0) {
				temp1[i] = nums[i];
			}
			// Do not consider the last element
			if (i != (n - 1)) {
				temp2[i] = nums[i];
			}
		}
		int ans1 = robberyFromHouse(temp1);
		int ans2 = robberyFromHouse(temp2);
		return Math.max(ans1, ans2);
	}

	public int robberyFromHouse(int[] nums) {
		int n = nums.length;
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
