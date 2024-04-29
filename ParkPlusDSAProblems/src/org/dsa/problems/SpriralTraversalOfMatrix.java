package org.dsa.problems;

import java.util.*;

public class SpriralTraversalOfMatrix {
	//TC: O(m * n)
	//SC: O(m * n)
	public List<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length; // no. of rows
		int n = matrix[0].length; // no. of columns
		int top = 0, bottom = m - 1; // rows traversing
		int left = 0, right = n - 1; // columns traversing
		List<Integer> list = new ArrayList<>();

		while (top <= bottom && left <= right) {
			int tempLeft = left;
			while (tempLeft <= right && top <= bottom) {
				list.add(matrix[top][tempLeft]);
				tempLeft++;
			}
			tempLeft = left;
			top = top + 1;

			int tempTop = top;
			while (tempTop <= bottom && left <= right) {
				list.add(matrix[tempTop][right]);
				tempTop++;
			}
			tempTop = top;
			right = right - 1;

			int tempRight = right;
			while (tempRight >= left && top <= bottom) {
				list.add(matrix[bottom][tempRight]);
				tempRight--;
			}
			tempRight = right;
			bottom = bottom - 1;

			int tempBottom = bottom;
			while (tempBottom >= top && left <= right) {
				list.add(matrix[tempBottom][left]);
				tempBottom--;
			}
			tempBottom = bottom;
			left++;
		}

		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
