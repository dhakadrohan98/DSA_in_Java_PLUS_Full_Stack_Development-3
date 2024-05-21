package com.PreDirectorRound;

public class ProductOfArrayExceptSelf {
	//TC: O(3 * n)
    //SC: O(2 * n)
    public int[] productExceptSelf(int[] nums) {
        //optimized force approach
        int n = nums.length;
        int[] res = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        
        //prefix arr calculation
        prefix[0] = 1;
        for(int i=1; i<n; i++) {
            prefix[i] = nums[i-1] * prefix[i-1];   
        }
        
        //suffix arr calculation
        suffix[n-1] = 1;
        for(int j=n-2; j >= 0; j--) {
            suffix[j] = nums[j+1] * suffix[j+1];   
        }
            
        //calculate & store into res arr
        for(int i=0; i<n; i++) {
            res[i] = prefix[i] * suffix[i];   
        }
            
        return res;
    }
}
