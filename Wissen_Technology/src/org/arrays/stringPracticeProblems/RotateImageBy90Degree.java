package org.arrays.stringPracticeProblems;

import java.util.*;

public class RotateImageBy90Degree {
	
	//TC: O(2*m*n)
	//SC: O(m*n)
	public static void rotate(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < i; j++) {
				swap(i, j, matrix);
			}
		}
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			List<Integer> temp = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				temp.add(matrix[i][j]);
			}
			Collections.reverse(temp);
			list.add(temp);
		}
//		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			List<Integer> temp = list.get(i);
			for(int j=0; j<temp.size(); j++) {
				matrix[i][j] = temp.get(j);
			}
		}
	}

	private static void swap(int i, int j, int[][] matrix) {
		int temp = matrix[i][j];
		matrix[i][j] = matrix[j][i];
		matrix[j][i] = temp;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		rotate(matrix);
		
		for(int[] arr: matrix) {
			for(int val:arr) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
