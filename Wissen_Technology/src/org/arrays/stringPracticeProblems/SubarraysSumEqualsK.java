package org.arrays.stringPracticeProblems;

import java.util.*;

public class SubarraysSumEqualsK {
	//TC: O(n)
	//SC: O(n)
	public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int sum = 0;
        int count = 0;
        //put key-> 0 & sum->1 in hmap.
        hmap.put(0, 1);
        
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if(hmap.containsKey(sum - k)) {
                int val = hmap.get(sum - k);
                count += val;
            }
            hmap.put(sum, hmap.getOrDefault(sum, 0)+1);
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
