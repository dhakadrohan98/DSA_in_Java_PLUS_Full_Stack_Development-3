package org.arrays.stringPracticeProblems;

import java.util.*;

public class RemoveDuplicatesfromArray {

	public int removeDuplicates(int[] nums) {
        //TC: > O(n)
        //SC: < O(n)
        Map<Integer, Integer> lhmap = new LinkedHashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            lhmap.put(nums[i], lhmap.getOrDefault(nums[i], 0)+1);
        }
        int j=0;
        int size = 0;
        
        for(int key: lhmap.keySet()) {
            nums[j] = key;
            j++;
            size++;
        }
        return size;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
