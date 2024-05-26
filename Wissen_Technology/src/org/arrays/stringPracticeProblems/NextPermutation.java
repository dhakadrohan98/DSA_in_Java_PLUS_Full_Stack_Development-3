package org.arrays.stringPracticeProblems;

import java.util.Arrays;

public class NextPermutation {

	public void nextPermutation(int[] nums) {
		int n = nums.length;
		int index = -1;
		// Step 1: Find the break point:
		for (int i = n - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				index = i;
				break;
			}
		}
		// If break point does not exist:
		if (index == -1) {
			// sort array into ascending/increasing order
			Arrays.sort(nums);
		}
		// Step 2: Find the next greater element
		// and swap it with arr[ind]:
		for (int i = n - 1; i >= index + 1; i--) {
			if (nums[index] < nums[i]) {
				swap(index, i, nums);
				break;
			}
		}

		// step3
		reverse(nums, index + 1, n);
	}

	private void reverse(int[] nums, int start, int end) {
		int n = end;
		for (int i = start, j = n - 1; i <= n / 2 && j >= 0; i++, j--) {
			swap(i, j, nums);
		}

	}

	private void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
