package com.recusrion.leetcode.medium;

import java.util.*;

public class AllPermutationOfArrayString {

	private void recurePermute(int[] nums,List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        //base case
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return ;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(freq[i] == false) {
                freq[i] = true;
                ds.add(nums[i]);
                recurePermute(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
        
    }
    
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> ds = new ArrayList<>();
       boolean[] freq = new boolean[nums.length];
       recurePermute(nums, ds, ans, freq);
       return ans;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
