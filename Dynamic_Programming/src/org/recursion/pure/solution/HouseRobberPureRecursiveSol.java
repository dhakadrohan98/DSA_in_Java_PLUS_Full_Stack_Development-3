package org.recursion.pure.solution;

public class HouseRobberPureRecursiveSol {
	// TC: O(2^n)
	// SC: O(n)
	public int rob(int[] nums) {
		int n = nums.length;
		return helper(n - 1, nums);
	}

	public static int helper(int indx, int[] nums) {
		// base cases
		if (indx == 0)
			return nums[indx];

		// recursive call to helper(indx-2) & helper(indx-1)
		int pick = nums[indx];
		if (indx > 1) {
			pick += helper(indx - 2, nums);
		}
		int notPick = 0 + helper(indx - 1, nums);
		return Math.max(pick, notPick);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int n = nums.length;
		System.out.println(helper(n - 1, nums));
		int[] nums1 = { 2, 7, 9, 3, 1 };
		int n1 = nums1.length;
		System.out.println(helper(n1 - 1, nums1));

	}

}
