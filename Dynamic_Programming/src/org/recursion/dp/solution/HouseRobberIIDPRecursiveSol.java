package org.recursion.dp.solution;

import java.util.Arrays;

public class HouseRobberIIDPRecursiveSol {
	// TC: O(n-1) + O(n-1)
	//SC: O(n-1) stack space + O(2 * (n-1)) dp array
		public static int rob(int[] nums) {
			//edge case
			if(nums.length == 1) {
				return nums[0];
			}
			
			int n = nums.length;
			int[] dp1 = new int[n];
			int[] dp2 = new int[n];
			dp1[0] = -2; 
			dp2[n-1] = -2;
			
			for (int i = 0; i < n; i++) {
				//trim down the array from first element
				if(i != 0) {
					dp1[i] = -1;
				}
				//trim down the array from last element
				if(i != n-1) {
					dp2[i] = -1;
				}	
			}
			
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
			int firstExcept = helper(n - 1, first, dp1);
			int lastExcept = helper(n - 1, second, dp2);
			return Math.max(firstExcept, lastExcept);
		}

		public static int helper(int indx, int[] nums, int[] dp) {
			// base cases
			if (indx == 0)
				return nums[indx];
			
			if(dp[indx] != -1 && dp[indx] != -2) {
				return dp[indx];
			}

			// recursive call to helper(indx-2) & helper(indx-1)
			int pick = nums[indx];
			if (indx > 1) {
				pick += helper(indx - 2, nums, dp);
			}
			int notPick = 0 + helper(indx - 1, nums, dp);
			return dp[indx] = Math.max(pick, notPick);
		}

		public static void main(String[] args) {
			int[] nums = { 1, 2, 3 };
			System.out.println(rob(nums));

			int[] nums1 = { 1, 2, 3, 1 };
			System.out.println(rob(nums1));

		}
}
