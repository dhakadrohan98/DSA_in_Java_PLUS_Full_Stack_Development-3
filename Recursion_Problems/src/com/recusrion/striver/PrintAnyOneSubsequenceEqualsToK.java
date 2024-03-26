package com.recusrion.striver;

import java.util.ArrayList;
import java.util.List;

public class PrintAnyOneSubsequenceEqualsToK {
	/*
	 * If we are getting an ans(through left subtree) then we have to avoid /
	 * future(towards right subtree) recursion call.
	 * 
	 */
	private static boolean sub(int indx, List<Integer> list, int[] arr, int s, int k, int len) {
		// base case
		if (indx == len) {
			// condition is satisfied then return tru	e.
			// sum is equal to k then print it.
			if (s == k) {
				for (int temp : list) {
					System.out.print(temp + " ");
				}
				return true;
			}
			// condition is not satisfied then return false.
			else {
				return false;
			}
		}
		// to pick or take
		list.add(arr[indx]);
		s = s + arr[indx];
		if (sub(indx + 1, list, arr, s, k, len) == true) {
			return true;
		}
		// not to pick or take
		list.remove(Integer.valueOf(arr[indx]));
		s = s - arr[indx];
		if (sub(indx + 1, list, arr, s, k, len) == true) {
			return true;
		}
		// if none of sub(indx + 1, list, arr, s, k, len) return true, then we have to
		// return false;
		return false;
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
