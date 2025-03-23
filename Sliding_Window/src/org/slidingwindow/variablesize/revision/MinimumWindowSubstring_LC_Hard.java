package org.slidingwindow.variablesize.revision;

import java.util.*;

public class MinimumWindowSubstring_LC_Hard {

	// s.length() -> n
	// t.length() ->m
	// TC: O(n) + O(m)
	// SC: O(m)
	public String minWindow(String s, String t) {
		Map<Character, Integer> hmap = new HashMap<>();
		for (char ch : t.toCharArray()) {
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		}
		int i = 0, j = 0;
		int minWinSize = Integer.MAX_VALUE;
		int startIndex = -1, endIndex = -1;
		int n = s.length();
		int distinctCount = hmap.size();

		while (j < n) {
			// do some calculation
			char ch = s.charAt(j);
			if (hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) - 1);
				if (hmap.get(ch) == 0) {
					distinctCount--;
				}
			}

			if (distinctCount > 0) { // condition is not met
				j++;
			} else if (distinctCount == 0) {
				// found one potential candidate for ans
				while (distinctCount == 0) {
					// so calculation for ans
					// if min window size is greater than current window size then update start &
					// end pointer & min window size
					if (minWinSize > j - i + 1) {
						startIndex = i;
						endIndex = j;
						minWinSize = j - i + 1;
					}
					// update map & distinctCount for index i
					char ichar = s.charAt(i);
					if (hmap.containsKey(ichar)) {
						hmap.put(ichar, hmap.get(ichar) + 1);
						if (hmap.get(ichar) == 1) {
							distinctCount++;
						}
					}
					// shrink the window from left to find the next potential candidate for ans
					i++;
				}
				j++;
			}
		}
		// base case if no such substring is found then return empty string
		if (startIndex == -1 || minWinSize == Integer.MAX_VALUE) {
			return "";
		}
		return s.substring(startIndex, endIndex + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
