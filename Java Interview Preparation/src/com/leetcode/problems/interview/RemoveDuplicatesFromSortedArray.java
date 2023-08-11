package com.leetcode.problems.interview;
import java.util.*;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		Map<Integer,Integer> hmap = new HashMap<>();
		int k=0;
		int j=0;
		
		for(int i=0; i<nums.length; i++) {
			int val = nums[i];
			
			if(!hmap.containsKey(val)) {
				nums[j] = val;
				hmap.put(val, 1);
				j++;
			}
		}
	
		for(int itr:nums) {
			System.out.println(itr);
		}
		System.out.println("*******************************");
		System.out.println(hmap.size());
	}

}
