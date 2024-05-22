package com.PreDirectorRound;

public class MaximumSubarrayKadanesAlgorithm {
	// TC: O(n)
	// SC: O(1)
	public int maxSubArray(int[] nums) {
		int max_so_far = Integer.MIN_VALUE;
		int max_till_now = 0;

		for (int i = 0; i < nums.length; i++) {
			max_till_now += nums[i];
			max_so_far = Math.max(max_so_far, max_till_now);
			if (max_till_now < 0) {
				max_till_now = 0;
			}
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
