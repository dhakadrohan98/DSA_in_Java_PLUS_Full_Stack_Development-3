package org.codeship.slidingwindow;

public class MaxSumOfSubArraySizeK {

	public static long maximumSubarraySum(int[] nums, int k) {
		if (nums.length < k) {
			return 0;
		}

		long max = Long.MIN_VALUE;
		long sum = 0;
		int i = 0, j = 0;

		while (j < nums.length) {

			sum = sum + nums[j];

			if (j - i + 1 < k) { // if j-i+1 is less than window size K
				j++;
			} else if (j - i + 1 == k) { // if j-i+1 is equal to the window size K
				max = Math.max(max, sum);
				sum = sum - nums[i];
				i++;
				j++;
			}

		}
		return max;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 5, 4, 2, 3, 7, 8 };
		int k = 3;
		System.out.println(maximumSubarraySum(nums, k));

	}

}
