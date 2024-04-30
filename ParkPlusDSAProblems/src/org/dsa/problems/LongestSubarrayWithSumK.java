package org.dsa.problems;

import java.util.*;

//Hashing
public class LongestSubarrayWithSumK {
	//TC: O(N^2)
	//SC: O(1)
	public static int lenOfLongSubarr(int nums[], int k) {
		Map<Integer, Integer> hmap = new HashMap<>();
		int prefixSum = 0, maxi = 0;

		for (int i = 0; i < nums.length; i++) {
			prefixSum += nums[i];

			if (prefixSum == k) {
				maxi = Math.max(maxi, i + 1);
			}

			if (hmap.containsKey(prefixSum - k)) {
				maxi = Math.max(maxi, i - hmap.get(prefixSum - k));
			}

			if (!hmap.containsKey(prefixSum)) {
				hmap.put(prefixSum, i);
			}
		}
		return maxi;
	}

	public static void main(String[] args) {
		int[] nums = {10, 5, 2, 7, 1, 9};
		int k = 15;
		System.out.println(lenOfLongSubarr(nums, k));

	}

}
