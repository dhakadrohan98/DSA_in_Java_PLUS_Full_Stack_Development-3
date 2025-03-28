package org.designgurus.twopointer.revision;

public class LongestPalindromicSusbstring {

	// TC: O(2 * n^2)
	// SC: O(1)
	public String longestPalindrome(String s) {
		int n = s.length();
		int start = 0, end = 0;
		int maxLength = 0;
		// for even length string
		for (int i = 0; i < n; i++) {
			int l = i, r = i;
			while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
				l--;
				r++;
			}
			int currLen = r - l - 1;
			if (maxLength < currLen) {
				maxLength = currLen;
				start = l + 1;
				end = r - 1;
			}
		}
		// for odd length string
		for (int i = 1; i < n; i++) {
			int l = i - 1, r = i;
			while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
				l--;
				r++;
			}
			int currLen = r - l - 1;
			if (maxLength < currLen) {
				maxLength = currLen;
				start = l + 1;
				end = r - 1;
			}
		}
		return s.substring(start, end + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
