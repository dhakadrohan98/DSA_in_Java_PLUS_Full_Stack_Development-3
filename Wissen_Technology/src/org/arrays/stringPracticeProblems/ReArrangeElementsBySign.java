package org.arrays.stringPracticeProblems;

public class ReArrangeElementsBySign {

	// TC: O(n)
	// SC: O(n)
	public int[] rearrangeArray(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int positive = 0;
		int negative = 1;
		for (int i = 0; i < n; i++) {
			if (nums[i] < 0) {
				result[negative] = nums[i];
				negative += 2;
			} else {
				result[positive] = nums[i];
				positive += 2;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
