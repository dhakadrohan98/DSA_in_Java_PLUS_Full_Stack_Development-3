package org.codeship.binarysearch;

public class SearchInRotatedSortedArrayII {

	public boolean search(int[] nums, int target) {
		int low = 0, high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				return true;
			}

			// for duplicate elements's edge case
			if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
				low++;
				high--;
				continue;
			}

			// left sorted
			if (nums[low] <= nums[mid]) {
				if (nums[low] <= target && target <= nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			// right sorted
			else {
				if (nums[mid] <= target && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
