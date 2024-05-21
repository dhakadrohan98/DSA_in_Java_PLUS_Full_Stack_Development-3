package com.PreDirectorRound;

import java.util.*;

public class CountSubarraySumEqualsK {

	// TC: O(N)
	// SC: O(N)
	public static int subarraySum(int[] nums, int k) {
		int count = 0, prefixSum = 0;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		hmap.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			prefixSum += nums[i];
			int remain = prefixSum - k;
			if (hmap.containsKey(remain)) {
				count += hmap.get(remain);
			}
			// Storing prefix sum
			hmap.put(prefixSum, hmap.getOrDefault(prefixSum, 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
