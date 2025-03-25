package org.codeship;

import java.util.*;
public class ContiguousArray {
	// TC: O(n)
	// SC: < O(n)
	public int findMaxLength(int[] nums) {
		int n = nums.length;
		int max = 0, prefixSum = 0;
		Map<Integer, Integer> hmap = new HashMap<>();
		hmap.put(0, -1);

		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				prefixSum += -1;
			} else {
				prefixSum += 1;
			}
			if (hmap.containsKey(prefixSum)) {
				int startIndx = hmap.get(prefixSum);
				max = Math.max(max, i - startIndx);
			} else {
				hmap.put(prefixSum, i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
