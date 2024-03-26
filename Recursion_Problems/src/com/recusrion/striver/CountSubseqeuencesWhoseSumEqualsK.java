package com.recusrion.striver;

import java.util.ArrayList;
import java.util.List;

public class CountSubseqeuencesWhoseSumEqualsK {
	/*
	 * If we are getting an ans(through left subtree) then we have to avoid /
	 * future(towards right subtree) recursion call.
	 * 
	 */
	//TC: O(2^n)
	//SC: O(n)
	private static int sub(int indx, int[] arr, int s, int k, int len) {
		// two base cases to optimize the TC
		if(s > k) {
			return 0;
		}
		
		if (indx == len) {
			// condition is satisfied then return 1.
			// if sum is equal to k then return 1.
			if (s == k) {
				return 1;
			}
			// condition is not satisfied then return 0.
			else {
				return 0;
			}
		}
		// to pick or take
		s = s + arr[indx];
		int left = sub(indx + 1, arr, s, k, len);
		// not to pick or take
		s = s - arr[indx];
		int right = sub(indx + 1, arr, s, k, len);
		return left + right;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3};
		int k = 3;
		int len = arr.length;
		int indx = 0;
		int s = 0;
		System.out.println(sub(indx, arr, s, k, len));

	}
}
