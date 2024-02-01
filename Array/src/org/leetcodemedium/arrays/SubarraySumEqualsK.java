package org.leetcodemedium.arrays;

import java.util.*;

public class SubarraySumEqualsK {

	public static int subarraySum(int[] nums, int k) {
		int count=0;
		HashMap<Integer,Integer> hmap = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<nums.length; i++) {
			set.add(nums[i]);
		}
		
		for(int i=0; i<nums.length; i++) {
			int n1 = nums[i];
			int n2 = k- n1;
			
			if(n1 == k) {
				count++;
			}
			else {
				if(hmap.containsKey(n2) && hmap.get(n2) > 0) {
					count++;
					hmap.put(n2, hmap.get(n2)-1);
				}
				else if(set.contains(-n1)) {
					count++;
					
				}
			}
			if(hmap.containsKey(n1)) {
				hmap.put(n1, hmap.get(n1)+1);
			} else {
				hmap.put(n1,1);
			}
		}
		System.out.println(hmap);
		
		return count;
	
    }

	public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {1,1,1};
		int[] nums3 = {1,-1,0};
		int k1 = 3;
		int k2 = 2;
		int k3 = 0;
		int subarraySum = subarraySum(nums3,k3	);
		System.out.println(subarraySum);

	}

}
