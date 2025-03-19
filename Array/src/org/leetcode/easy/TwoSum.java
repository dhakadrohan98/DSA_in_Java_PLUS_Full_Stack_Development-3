package org.leetcode.easy;

import java.util.*;

public class TwoSum {
	
	//TC: O(n * logn) in the worst case
	//SC: O(n) storing element into map
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int len = nums.length;

        for(int i = 0; i < len; i++) {
            int remaining = target - nums[i];
            if(hmap.containsKey(remaining)) {
                return new int[]{i, hmap.get(remaining)};
            }
            hmap.put(nums[i], i);
        }

        return new int[]{};
    }
	
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		int[] result = twoSum(nums, target);
		for(int i : result) {
			System.out.print(i + " ");
		}

	}

}
