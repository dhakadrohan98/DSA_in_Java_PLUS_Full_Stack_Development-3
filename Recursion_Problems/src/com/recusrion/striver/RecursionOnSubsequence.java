package com.recusrion.striver;

import java.util.*;

public class RecursionOnSubsequence {
	//TC: O(N * 2^n)
	//SC: O(N)
	private static void print(int indx, List<Integer> list, int[] arr, int n) {
		// base case
		if (indx == n) {
			for (int temp : list) {
				System.out.print(temp + " ");
			}
			if (list.size() != 0) {
				System.out.println();
			}
			// empty set
			if (list.size() == 0) {
				System.out.println("{}");
			}
			return;
		}
		//take or pick the particular index into the subsequence
		list.add(arr[indx]);
		print(indx + 1, list, arr, n);
		list.remove(Integer.valueOf(arr[indx])); //remove(Object o) from the list or a particular element
		// not pick or not take condition, this element is not added to your subsequence.
		print(indx + 1, list, arr, n);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2 };
		List<Integer> list = new ArrayList<>();
		int n = arr.length;
		print(0, list, arr, n);

	}

}
