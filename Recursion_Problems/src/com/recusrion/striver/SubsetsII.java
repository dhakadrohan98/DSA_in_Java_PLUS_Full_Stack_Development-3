package com.recusrion.striver;

import java.util.*;

public class SubsetsII {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		// sort the array first before making any recursion call
		// because we need to avoid duplicate element.
		Arrays.sort(nums);
		findSubsets(0, nums, new ArrayList<>(), ans);
		return ans;
	}

	private void findSubsets(int indx, int[] nums, List<Integer> ds, List<List<Integer>> ans) {
		// adding answer to the list
		ans.add(new ArrayList<>(ds));

		for (int i = indx; i < nums.length; i++) {
			// if previous & next element is same from indx+1 position
			if (i > indx && nums[i] == nums[i - 1]) {
				continue;
			}
			ds.add(nums[i]);
			findSubsets(i + 1, nums, ds, ans);
			ds.remove(Integer.valueOf(nums[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
