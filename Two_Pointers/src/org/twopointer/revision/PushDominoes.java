package org.twopointer.revision;

public class PushDominoes {

	// TC: O(3*n)
	// SC: O(2*n)
	public static String pushDominoes(String str) {
		int n = str.length();
		int[] left = new int[n];
		int[] right = new int[n];
		int nearestLeftIndex = -1;
		// build left force array
		for (int i = n - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (ch == 'L') {
				nearestLeftIndex = i;
			} else if (ch == 'R') {
				nearestLeftIndex = -1;
			}
			left[i] = nearestLeftIndex;
		}

		int nearestRightIndex = -1;
		// build right force array
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (ch == 'R') {
				nearestRightIndex = i;
			} else if (ch == 'L') {
				nearestRightIndex = -1;
			}
			right[i] = nearestRightIndex;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {

			if (left[i] == -1) {
				if (right[i] == -1) {
					sb.append('.');
				} else {
					sb.append('R');
				}
			} else if (right[i] == -1) {
				sb.append('L');
			} else {
				int absLeft = Math.abs(i - left[i]);
				int absRight = Math.abs(i - right[i]);
				if (absLeft == absRight) {
					sb.append('.');
				} else if (absLeft < absRight) {
					sb.append('L');
				} else {
					sb.append('R');
				}
			}

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = ".L.R...LR..L..";
		pushDominoes(str);
	}

}
