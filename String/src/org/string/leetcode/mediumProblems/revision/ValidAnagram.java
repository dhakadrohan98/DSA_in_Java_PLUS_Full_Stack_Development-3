package org.string.leetcode.mediumProblems.revision;

public class ValidAnagram {

	// TC: O(26)
	// SC: O(26)
	public boolean isAnagram(String s, String t) {
		int[] freq = new int[26];
		int n = s.length();
		int m = t.length();
		// edge case
		if (s.length() != t.length()) {
			return false;
		}

		for (int i = 0; i < n; i++) {
			freq[s.charAt(i) - 'a'] += 1;
		}

		for (int i = 0; i < m; i++) {
			freq[t.charAt(i) - 'a'] -= 1;
		}

		for (int i = 0; i < n; i++) {
			// freq of ith character in freq array has not become zero it means this
			// character was
			// not present in t String
			if (freq[s.charAt(i) - 'a'] > 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
