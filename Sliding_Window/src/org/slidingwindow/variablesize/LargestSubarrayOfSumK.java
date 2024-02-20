package org.slidingwindow.variablesize;

public class LargestSubarrayOfSumK {

	public static int maximumSubarraySumEqualsK(int[] nums, int k) {
		int i = 0, j = 0;
		int max = 0;
		int sum = 0;

		while (j < nums.length) {
			sum = sum + nums[j];

			if (sum < k) {
				j++;
			} else if (sum > k) {
				while (sum > k) {
					sum = sum - nums[i];
					i++;
				}
				if (sum == k) {
					max = Math.max(max, (j - i + 1));
					j++;
				} else {
					j++;
				}
			} else if (sum == k) {
				max = Math.max(max, (j - i + 1));
				j++;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 1, -1, 1, -3, 2, 5 };
		int[] nums1 = { 4, 1, 1, -2, 1, 5 };
		int k = 5;
		System.out.println(maximumSubarraySumEqualsK(nums1, k));

	}

}
