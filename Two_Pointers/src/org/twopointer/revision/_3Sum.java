package org.twopointer.revision;

import java.util.*;
public class _3Sum {

	//TC: O(n logn) + O(n^2)
    //SC: O(log n) due to sorting done on primitive types
    public List<List<Integer>> threeSum(int[] nums) {
        //step1 -> sort the array before applying two pointer pattern
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n-2; i++) {
            int j = i+1;
            int k = n-1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    set.add(temp);
                    j++;
                    k--;
                } else if(sum < 0) {
                    j++;
                } else { //sum > 0
                    k--;
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>(set);
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
