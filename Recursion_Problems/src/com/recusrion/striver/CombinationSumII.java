package com.recusrion.striver;

import java.util.*;

public class CombinationSumII {

	 private void findCombinations(int indx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
	        //base case
	        if(target == 0) {
	            ans.add(new ArrayList<>(ds));
	            return;
	        }
	        //Iterate from indx to arr.length-1
	        for(int i = indx; i < arr.length; i++) {
	            //Two edge cases
	            //if next element is also same then move head simply
	            if(i > indx && arr[i] == arr[i-1]) continue;
	            if(arr[i] > target) break;
	            
	            ds.add(arr[i]);
	            findCombinations(i+1, arr, target - arr[i], ans, ds);
	            ds.remove(ds.size() - 1);
	        }
	    }
	    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        List<List<Integer>> ans = new ArrayList<>();
	        Arrays.sort(candidates);
	        List<Integer> ds = new ArrayList<>();
	        int indx = 0;
	        findCombinations(indx, candidates, target, ans, ds);
	        return ans;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
