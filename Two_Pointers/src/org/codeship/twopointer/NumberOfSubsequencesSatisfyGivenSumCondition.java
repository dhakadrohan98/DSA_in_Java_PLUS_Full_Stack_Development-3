package org.codeship.twopointer;

import java.util.Arrays;

public class NumberOfSubsequencesSatisfyGivenSumCondition {
	
	 //TC: O(n*logn) + O(n) precompute powers of 2(0 to n) + O(n) while loop
    //SC: O(logn) + O(n) power array
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1000000007;
        int n = nums.length;
        int i = 0, j = n - 1;
        int res = 0;

        // Pre compute powers of 2 modulo mod
        int[] power = new int[n];
        power[0] = 1;
        for (int k = 1; k < n; k++) {
            power[k] = (power[k - 1] * 2) % mod;
        }

        while(i <= j) {
            int sum = nums[i] + nums[j];
            if(sum <= target) {
                res = (res + power[j-i]) % mod;
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
