package com.recusrion.striver;

import java.util.*;

public class PrintSubsequencesEqualsToK {

	private static void sub(int indx, List<Integer> list, int[] arr, int s, int k, int len) {
		// base case
		if (indx == len) {
			//sum is equal to k then print it.
			if (s == k) {
				for (int temp : list) {
					System.out.print(temp + " ");
				}
				System.out.println();
			}
			return;
		}
		// to pick or take
		list.add(arr[indx]);
		s = s + arr[indx];
		sub(indx + 1, list, arr, s, k, len);
		// not to pick or take
		list.remove(Integer.valueOf(arr[indx]));
		s = s - arr[indx];
		sub(indx + 1, list, arr, s, k, len);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };
		int k = 2;
		int len = arr.length;
		List<Integer> list = new ArrayList<>();
		int s = 0;
		int indx = 0;
		sub(indx, list, arr, s, k, len);

	}
}
