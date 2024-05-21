package com.PreDirectorRound;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
	// TC: O(n)
	// SC: O(n)
	public static int lenOfLongSubarr(int arr[], int N, int k) {
		Map<Integer, Integer> hmap = new HashMap<>();
		int prefixSum = 0;
		int longestLen = 0;

		for (int i = 0; i < N; i++) {
			prefixSum = prefixSum + arr[i];

			if (prefixSum == k) {
				longestLen = Math.max(longestLen, i + 1);
			} else if (hmap.containsKey(prefixSum - k)) {
				int j = hmap.get(prefixSum - k);
				longestLen = Math.max(longestLen, i - j);
			}
			if (!hmap.containsKey(prefixSum)) {
				hmap.put(prefixSum, i);
			}
		}
		return longestLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
