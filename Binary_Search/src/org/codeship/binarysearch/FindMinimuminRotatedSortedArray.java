package org.codeship.binarysearch;

public class FindMinimuminRotatedSortedArray {
	public int findMin(int[] nums) {
		int low = 0, high = nums.length - 1;
		int ans = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = (low + high) / 2;
			//search space is already sorted then always arr[low] will be smaller in that
            //search space.
            if(nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }
            
			// if left half is sorted
			if (nums[low] <= nums[mid]) {
				ans = Math.min(ans, nums[low]);
				// eliminate the left half
				low = mid + 1;
			}
			// right half is sorted
			else {
				ans = Math.min(ans, nums[mid]);
				// eliminate the right half
				high = mid - 1;
			}
		}
		return ans;
	}
}
