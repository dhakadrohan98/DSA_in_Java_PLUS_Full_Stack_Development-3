package org.slidingwindow.variablesize.revision;

public class LargestSubarrayOfSumK {

	//Source: Aditya verma
	// Note: this algorithm will not work if array contains negative elements
	// TC: O(n)
	// SC: O(1)
	public static int largestSubarraySumOfKs(int[] arr, int k) {
		int i = 0, j = 0, sum = 0;
		int maxi = 0;

		while (j < arr.length) {
			// do some calculations
			sum += arr[j];

			if (sum < k) { // condition < k
				j++;
			} else if (sum == k) { // condition == k
				// calculate ans
				maxi = Math.max(maxi, j - i + 1);
				j++;
			} else if (sum > k) { // condition > k
				// remove calculation for i
				while (sum > k) {
					sum -= arr[i];
					i++;
				}
				// check for any candidate
				if (sum == k) {
					maxi = Math.max(maxi, j - i + 1);
				}
				j++;
			}
		}
		return maxi;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 1, 1, 1, 2, 3, 5 };
		int k = 5;
		System.out.println(largestSubarraySumOfKs(arr, k));

	}

}
