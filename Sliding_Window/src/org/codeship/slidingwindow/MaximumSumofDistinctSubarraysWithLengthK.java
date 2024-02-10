package org.codeship.slidingwindow;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class MaximumSumofDistinctSubarraysWithLengthK {

	public static long maximumSubarraySum(int[] nums, int k) {
			
		if(nums.length < k) {
			return 0;
		}
		
		int len =  nums.length;
		List<Integer> list = new ArrayList<>();
		//storing unique elements into set
		list.add(0);
		for(int i=1; i<nums.length-1; i++) {
			if( i >= 1 && i <= nums.length-2 && list.get(i-1) != nums[i] && list.get(i+1) != nums[i]) {
				list.add(nums[i]);
			}
		}
		//checking last element
		if(list.get(len-2) != nums[len-1]) {
			list.add(nums[len-1]);
		}
		
		
		//if set size is less than k after removing duplicates
		if(list.size() < k) {
			return 0;
		}
		System.out.println(list);
		
		
		int[] arr = new int[list.size()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = list.get(i);
		}
		
		long max = 0;
		long sum = 0;
		
		int i = 0, j = 0;

		while (j < arr.length) {

			sum = sum + arr[j];

			if (j - i + 1 < k) { // if j-i+1 is less than window size K
				j++;
			} else if (j - i + 1 == k) { // if j-i+1 is equal to the window size K
				max = Math.max(max, sum);
				sum = sum - arr[i];
				i++;
				j++;
			}

		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,5,4,2,9,9,9};
		System.out.println(maximumSubarraySum(nums, 3));

	}

}
