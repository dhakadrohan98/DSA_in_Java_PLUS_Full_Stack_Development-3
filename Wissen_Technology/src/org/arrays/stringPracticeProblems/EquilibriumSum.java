package org.arrays.stringPracticeProblems;

public class EquilibriumSum {

	//Optimized way
	//TC: O(2*n)
    //SC: O(1)
    public static int equilibriumPoint(long nums[], int n) {
        //edge case
        if(n==1) {
            return (int)nums[0];
        }
        long sr = 0;
        for(int i=1; i<n; i++) {
            sr += nums[i];
        }
        long sl = 0;
        
        for(int i=0; i < n-1; i++) {
            if(sl == sr) {
                return i+1;
            } else {
                sl = sl + nums[i];
                sr = sr - nums[i+1];
            }
        }
        return -1;
    }
    
    //better solution
	// TC: O(3*n)
	// SC: O(2*n)
	public static int equilibriumPoint2(long nums[], int n) {
		long[] prefixSum = new long[n];
		long[] suffixSum = new long[n];

		prefixSum[0] = 0;
		for (int i = 1; i < n; i++) {
			prefixSum[i] = nums[i - 1] + prefixSum[i - 1];
		}

		suffixSum[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {
			suffixSum[i] = nums[i + 1] + suffixSum[i + 1];
		}

		for (int i = 0; i < n; i++) {
			if (prefixSum[i] == suffixSum[i]) {
				return i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
