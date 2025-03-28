package org.designgurus.twopointer.revision;

import java.util.*;

// 292/294 test cases passed
public class _4Sum {
	
	// TC: O(n^3) + O(n log n)
	// SC: O(log n) sorting on primitive types
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Set<List<Integer>> set = new HashSet<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				int left = j + 1;
				int right = nums.length - 1;
				while (left < right) {
					long sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum < target) {
						left++;
					} else if (sum > target) {
						right--;
					} else if (sum == target) {
						// sum == target
						List<Integer> combination = new ArrayList<>();
						combination.add(nums[i]);
						combination.add(nums[j]);
						combination.add(nums[left]);
						combination.add(nums[right]);
						set.add(combination);
						left++;
						right--;
					}
				}
			}
		}
		List<List<Integer>> ans = new ArrayList<>(set);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
