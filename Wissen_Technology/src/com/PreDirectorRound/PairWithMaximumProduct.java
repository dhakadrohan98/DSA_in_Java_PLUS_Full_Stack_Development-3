package com.PreDirectorRound;

import java.util.Arrays;

public class PairWithMaximumProduct {
	//Quick sort will be applied
	//TC: O(n^2)
	//SC: O(n)
	public static int[] pairWithMaxProduct(int[] nums) {
		int n = nums.length;
		int[] res = new int[2];
		//base case
		if(n < 2) {
			return res;
		}
		
		int firstProduct = nums[0] * nums[1];
		int lastProduct = nums[n-1] * nums[n-2];
		
		if(firstProduct >= lastProduct) {
			res[0] = nums[0];
			res[1] = nums[1];
		}
		else if(firstProduct < lastProduct) {
			res[0] = nums[n-1];
			res[1] = nums[n-2];
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1,8,3,6,7,0};
		int[] nums2 = {-1, -3, -6, 3, 0, -5};
		//java.util.Arrays uses quicksort for primitive types such as int and 
		//mergesort for objects that implement Comparable or use a Comparator.
		Arrays.sort(nums2);
		
		int[] res = pairWithMaxProduct(nums2);
		
		for(int val : res) {
			System.out.print(val + " ");
		}

	}

}
