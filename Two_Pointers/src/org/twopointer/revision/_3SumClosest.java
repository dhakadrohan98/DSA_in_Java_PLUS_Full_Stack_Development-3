package org.twopointer.revision;

import java.util.Arrays;

public class _3SumClosest {
	
	//TC: O(n^2) + O(n * logn)
    //SC: O(logn) due to dual pivot quick sort algorithm
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = Integer.MAX_VALUE; 
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n-1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int abs = Math.abs(target - sum);
                if(abs < closest) {
                    closest = abs;
                    ans = sum;
                }
                if(sum <= target) {
                    j++;
                } else if(sum > target) {
                    k--;
                } //else {
                //     j++;
                //     k--;
                // }
            }
        }
        return ans;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
