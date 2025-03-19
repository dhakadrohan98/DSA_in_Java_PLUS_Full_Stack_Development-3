package org.leetcodemedium.arr;

public class MaximumScoreFromSubarrayMinimums {

	 //TC: O(n^2) -> O(n)
    //SC: O(1)
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        int maxi = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            int currPairSum = arr[i] + arr[i+1];
            maxi = Math.max(maxi, currPairSum);
        }
        return maxi;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
