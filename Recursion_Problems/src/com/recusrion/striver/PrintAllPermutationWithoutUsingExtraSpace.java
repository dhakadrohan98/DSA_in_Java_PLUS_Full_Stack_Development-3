package com.recusrion.striver;

import java.util.*;

public class PrintAllPermutationWithoutUsingExtraSpace {

	// TC: O(n!) * O(n)
	// SC: O(1)
	// auxiliary space: O(n) for recursion depth and O(n!) to store ans

	private void recurePermute(int index, int[] nums, List<List<Integer>> ans) {
		// base case
		if (index == nums.length) {
			// copy the ds to ans
			List<Integer> ds = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				ds.add(nums[i]);
			}
			ans.add(new ArrayList<>(ds));
			return;
		}

		for (int i = index; i < nums.length; i++) {
			swap(i, index, nums);
			recurePermute(index + 1, nums, ans);
			swap(i, index, nums);
		}
	}

	private void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public List<List<Integer>> permute(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		int indx = 0;
		recurePermute(indx, nums, ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
