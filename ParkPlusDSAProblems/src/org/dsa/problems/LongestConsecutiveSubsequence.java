package org.dsa.problems;

import java.util.*;

public class LongestConsecutiveSubsequence {
	//TC: O(N)
	//SC: O(N)
	public static int findLongestConseqSubseq(int[] arr, int n) {
		int longest = 0;
		Set<Integer> set = new HashSet<>();
		for (int val : arr) {
			set.add(val);
		}

		for (int i = 0; i < n; i++) {
			int j = 1;
			int count = 1;
			while (set.contains(arr[i] - j)) {
				count++;
				j++;
			}
			longest = Math.max(longest, count);
		}
		return longest;
	}

	public static void main(String[] args) {
		int[] nums = {2,6,1,9,4,5,3};
		int n = nums.length;
		System.out.println(findLongestConseqSubseq(nums, n));
	}

}
