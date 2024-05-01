package org.dsa.problems;

import java.util.HashMap;

public class CountSubarraySumEqualsK {
	// TC: O(N)
	// SC: O(N)
	public static int countSubarraySum(int[] nums, int k) {
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
		int[] nums = new int[] { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
		int target = 3;
		System.out.println(countSubarraySum(nums, target));

	}

}

//Naive approach
//TC: O(n^2)
//SC: O(1)
//	public static int countSubarraySum(int[] nums, int target) {
//		int n = nums.length;
//		int count = 0;
//		
//		for(int i = 0; i < n; i++) {
//			int sum = 0;
//			for(int j = i; j < n; j++) {
//				sum += nums[j];
//				if(sum == target) {
//					count++;
//				}
//			}
//		}
//		
//		return count;
//	}
