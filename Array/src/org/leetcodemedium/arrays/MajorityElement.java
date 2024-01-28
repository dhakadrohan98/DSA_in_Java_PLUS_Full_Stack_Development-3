package org.leetcodemedium.arrays;

import java.util.HashMap;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		int majority=0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            if(hmap.containsKey(nums[i])) {
                hmap.put(nums[i], hmap.get(nums[i])+1);
            }
            else {
               hmap.put(nums[i],1); 
            }
        }
        System.out.println(hmap);
        
        for(int key: hmap.keySet()) {
            if(hmap.get(key) > nums.length/2) {
                majority = key;
            }
        }
        return majority;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		int result = majorityElement(nums);
		System.out.println(result);

	}

}
