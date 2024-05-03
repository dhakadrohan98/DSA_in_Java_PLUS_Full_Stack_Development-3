package org.recursion.pure.solution;

import java.util.Arrays;

public class HouseRobberIIPureRecursiveSol {
	// TC: O(2^(n-1)) + O(2^(n-1))
	// SC: O(n) stack space
	public static int rob(int[] nums) {
		//edge case
		if(nums.length == 1) {
			return nums[0];
		}
		
		int n = nums.length;
		// Elements are stored except first element as arr[1,2,3,......,n-1], keep size
		// of first arr[] same as of original array
		int[] first = new int[n];
		int[] second = new int[n];
		
		for (int i = 0; i < n; i++) {
			//trim down the array from first element
			if(i != 0) {
				first[i] = nums[i];
			}
			//trim down the array from last element
			if(i != n-1) {
				second[i] = nums[i];
			}	
		}
		int firstExcept = helper(n - 1, first);
		int lastExcept = helper(n - 1, second);
		return Math.max(firstExcept, lastExcept);
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
		int[] nums = { 1, 2, 3 };
		System.out.println(rob(nums));

		int[] nums1 = { 1, 2, 3, 1 };
		System.out.println(rob(nums1));

	}
}
