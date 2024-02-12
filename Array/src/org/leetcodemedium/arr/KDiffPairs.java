package org.leetcodemedium.arr;

import java.util.HashMap;

public class KDiffPairs {

	public static int kdiffPairs(int[] nums, int k) {
		 HashMap<Integer, Integer> hmap = new HashMap<>();
	        int count=0;
	        
	        //constructing HashMap
	        for(int i=0; i<nums.length; i++) {
	            if(hmap.containsKey(nums[i])) {
	                int val = hmap.get(nums[i]);
	                hmap.put(nums[i], val+1);
	            }
	            else {
	                hmap.put(nums[i], 1);
	            }
	        }
	        System.out.println(hmap);
	        
	        for(int key: hmap.keySet()) {
	        	if(k == 0 && hmap.get(key) > 1) {
	        		System.out.println("Count from 1st IF: "+ count);
	        		count++;
	        	}
	        	else if(k > 0 && hmap.containsKey(key+k)) {
	        		count++;
	        		System.out.println("Count from 2nd IF: "+ count);
	        	}
	        }
	        
			return count;
		
	}
	
	public static void main(String[] args) {
		int[] nums= {1,3,1,5,4};
		int k = 2;
		
		int result = kdiffPairs(nums, k);
		System.out.println(result);

	}

}
