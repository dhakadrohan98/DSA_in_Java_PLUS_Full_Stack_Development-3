package org.codeship.twopointer;

/******************************************************************************

Online Java Compiler.
Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Input: nums = [-1,2,1,-4], target = 1

//Output = 2

//The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

//EX: 2
//[4,0,5,-5,3,3,0,-4,-5] -> [-5, -5, -4, 0, 0, 3, 3, 5]
//Target = -2

//sudo code
//int ans = 0;
//int k = nums.length - 1;

//i=0 -> ,nums.length - 3
//j=i+1 -> nums.length - 2

//if(j <= k)

//sum = -5

import java.util.*;

public class _3ClosestSumGammaprepMock {
	public static void main(String[] args) {
		int[] nums1 = { 4, 0, 5, -5, 3, 3, 0, -4, -5 };
		int target1 = -1;
		int[] nums2 = { -1, 2, 1, -4 };
		int target2 = 1;

		Arrays.sort(nums1);
		System.out.println(findClosetSum(nums1, target1));

	}
	//TC: O(n^2)
	public static int findClosetSum(int[] nums, int target) {
		int k = nums.length - 1;
		int ans = Integer.MAX_VALUE;
		int sum = 0;
		int debug = 0;
		boolean isJbreaked = false;

		for (int i = 0; i < nums.length - 2; i++) {
			if (isJbreaked == true) {
				break;
			}

			for (int j = i + 1; j < nums.length - 1; j++) {
				if (j < k) {
					System.out.println("Debug: " + (++debug));
					sum = nums[i] + nums[j] + nums[k];
					ans = sum;
					System.out.println("ans: " + ans);
					if (sum == target) {
						isJbreaked = true;
						break;
					}
					if (sum < target) {
						continue;
					} else if (sum > target) {
						k--;
					}
				}

			}
		}
		return ans;
	}
}
