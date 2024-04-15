package org.codeship.slidingwindow.fixedsize;

public class MaxSumOfSubArraySizeK {

	public static long maximumSubarraySum(int[] nums, int k) {
		if (nums.length < k) {
			return 0;
		}
		long max = Long.MIN_VALUE;
		long sum = 0;
		int i = 0, j = 0;

		while (j < nums.length) {
			//do some calculation
			sum = sum + nums[j];
//			System.out.println("j: " + j + " sum: " + sum );
			
			if (j - i + 1 < k) { // if j-i+1 is less than window size K
				j++; // it will run for k-1 times
			} else if (j - i + 1 == k) { // if j-i+1 is equal to the window size K
				max = Math.max(max, sum); //get the ans & update max variable
				//remove the valeu of arr[i] from sum
				sum = sum - nums[i];
				i++;
				j++;
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 5, 4, 12, 3, 7, 6 };
		int k = 3;
		System.out.println(maximumSubarraySum(nums, k));

	}

}
