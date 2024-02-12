package org.leetcodemedium.arr;

import java.util.*;

public class SubArraySumEqualsK {

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
			if (hmap.containsKey(prefixSum)) {
				int val = hmap.get(prefixSum) + 1;
				hmap.put(prefixSum, val);
			} else {
				hmap.put(prefixSum, 1);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 1, 1, 1 };
		int[] nums3 = { 1, -1, 0 };
		int k1 = 3;
		int k2 = 2;
		int k3 = 0;
		int subarraySum = subarraySum(nums3, k3);
		System.out.println(subarraySum);
	}
}
