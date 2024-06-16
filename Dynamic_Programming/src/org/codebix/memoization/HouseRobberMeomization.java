package org.codebix.memoization;

import java.util.*;

public class HouseRobberMeomization {

	//TC: < O(2^n)
    //SC: O(1)
    public int rob(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> hmap = new HashMap<>();
        return helper(n-1, nums, hmap);
    }
    
    public int helper(int indx, int[] nums, Map<Integer, Integer> hmap) {
        int key = indx;
        //base case
        if(indx == 0) {
            return nums[indx];
        }
        
        if(indx < 0) {
            return 0;
        }
        
        if(hmap.containsKey(key)) {
            return hmap.get(key);
        }
        
        int choose = nums[indx] + helper(indx-2, nums, hmap);
        int notChoose = 0 + helper(indx-1, nums, hmap);
        hmap.put(key, Math.max(choose, notChoose));
        return Math.max(choose, notChoose);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
