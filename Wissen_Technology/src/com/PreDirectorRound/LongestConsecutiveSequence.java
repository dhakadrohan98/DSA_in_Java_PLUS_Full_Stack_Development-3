package com.PreDirectorRound;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	// TC: O(2n) = O(n)
	// SC: O(n)
	public int longestConsecutive(int[] nums) {
		int longest = 0;
		Set<Integer> set = new HashSet<>();

		for (int temp : nums) {
			set.add(temp);
		}
		// Iterate through set & check if (temp-1) doesn’t exist in set, it means temp is a starting     number of series, Then make temp as base(starting number of new series) and initialize count=1; int x = temp; and check if is (x+1) contained in the set or not. If yes then perform:
		// x = x + 1; //next number of series
		// count = count + 1;

		for (int temp : set) {
			if (!set.contains(temp - 1)) { // temp is a starting no. of new series
				int count = 1;
				int x = temp;
				while (set.contains(x + 1)) {
					x = x + 1;
					count += 1;
				}
				longest = Math.max(longest, count);
			}
		}
		return longest;
	}
}
