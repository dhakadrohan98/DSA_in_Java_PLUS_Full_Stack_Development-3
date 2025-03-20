package org.codeship.slidingwindow.fixedsize.revision;

public class MaxSumOfSubArraySizeK_Rev {
	//TC: O(n)
    //SC: O(1)
    public int maximumSumSubarray(int[] arr, int k) {
        int sum = 0;
        int maxSum = 0;
        int i = 0, j = 0;
        while(j < arr.length) {
            //do some calculations
            sum += arr[j];
            if(j-i+1 < k) {
                j++;
            } else if(j-i+1 == k) {
                //do calculation for ans
                maxSum = Math.max(maxSum, sum);
                //Remove calculation for i
                sum -= arr[i];
                //slide the window
                i++;
                j++;
            }
        }
        return maxSum;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
