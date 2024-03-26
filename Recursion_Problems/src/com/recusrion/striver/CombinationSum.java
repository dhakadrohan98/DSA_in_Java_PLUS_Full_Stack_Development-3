package com.recusrion.striver;

import java.util.*;

public class CombinationSum {

	private void findCombinations(int indx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
		// base case
		if (indx == arr.length) {
			if (target == 0) {
				ans.add(new ArrayList<>(ds));
			}
			return;
		}

		if (arr[indx] <= target) {
			ds.add(arr[indx]);
			findCombinations(indx, arr, target - arr[indx], ans, ds);
			ds.remove(Integer.valueOf(arr[indx]));
		}
		findCombinations(indx + 1, arr, target, ans, ds);
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		int indx = 0;
		List<Integer> ds = new ArrayList<>();
		findCombinations(indx, candidates, target, ans, ds);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
