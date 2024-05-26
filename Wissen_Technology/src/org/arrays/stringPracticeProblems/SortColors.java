package org.arrays.stringPracticeProblems;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SortColors {
	//TC: O(2*n)
	//SC: O(n)
	public static void sortColors(int[] nums) {
        Map<Integer, Integer> tmap = new TreeMap<>();
        for(int i=0; i<nums.length; i++) {
            tmap.put(nums[i], tmap.getOrDefault(nums[i],0) + 1);
        }
        int j=0;
        
        for(int key : tmap.keySet()) {
        	int counter = 1;
            int val = tmap.get(key);
            while(j < nums.length && counter <= val) {
            	nums[j] = key;
            	j++;
            	counter++;
            }
        }
    }
	
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		for(int val: nums) {
			System.out.print(val + " ");
		}
	}

}
