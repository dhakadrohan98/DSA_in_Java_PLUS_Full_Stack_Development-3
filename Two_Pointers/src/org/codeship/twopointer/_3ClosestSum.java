package org.codeship.twopointer;

import java.util.Arrays;

public class _3ClosestSum {

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int closestSum = nums[0] + nums[1] + nums[nums.length - 1];
		System.out.println("closestSum: " +closestSum);
		for (int i = 0; i <= nums.length - 3; i++) {
			int start = i + 1;
			int end = nums.length - 1;

			while (start < end) {
				int currSum = nums[i] + nums[start] + nums[end];
				System.out.println("currSum: " + currSum);
				if (currSum > target) {
					end--;
				} else {
					start++;
				}
				
				System.out.println("Math.abs(currSum - target): " + Math.abs(currSum - target));
				System.out.println("Math.abs(closestSum - target): " + Math.abs(closestSum - target));
				if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
					closestSum = currSum;
				}
			}
		}
		return closestSum;
	}

	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		int target = 1;
		System.out.println(threeSumClosest(nums, target));

	}

}
