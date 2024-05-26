package org.arrays.stringPracticeProblems;

import java.util.*;

public class KDiffPairs {
	//TC: O(2*n)
	//SC: O(n)
	public static int findPairs(int[] nums, int k) {
		Map<Integer, Integer> hmap = new HashMap<>();
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
		}
		System.out.println(hmap);
		
		for(int key: hmap.keySet()) {
			if(k == 0 && hmap.get(key) > 1) {
				count++;
//				System.out.println(count);
			}
			else if(k > 0 && hmap.containsKey(k+key)) {
				count++;
//				System.out.println(count);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,3,1,5,4};
		int k = 0;
		System.out.println(findPairs(nums, k));

	}

}
