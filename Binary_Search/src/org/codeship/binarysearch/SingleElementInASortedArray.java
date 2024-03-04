package org.codeship.binarysearch;

public class SingleElementInASortedArray {
	public static int singleNonDuplicate(int[] nums) {

		int n = nums.length;

		// Edge Cases
		// If array len is 1
		if (nums.length == 1) {
			return nums[0];
		}
		// first element
		if (nums[0] != nums[1]) {
			return nums[0];
		}
		// last element
		if (nums[n - 1] != nums[n - 2]) {
			return nums[n - 1];
		}

		int low = 1, high = nums.length - 2;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
				return nums[mid];
			}
			// Elimination
			if ((mid % 2 == 1 && nums[mid - 1] == nums[mid]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
				low = mid + 1; // eliminate left half
			} else {
				high = mid - 1; // eliminate right half
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		System.out.println(singleNonDuplicate(nums));

	}

}

//Algorithm by Rohan Dhakad:
//public static int singleNonDuplicate(int[] nums) {
//	int low = 0, high = nums.length-1;
//	boolean duplicate = false;
//	int min = -1;
//
//	while (low <= high) {
//		int mid = (low + high) / 2;
//
//		if ((mid - 1) >= 0 || (mid + 1) < nums.length) {
//
//			if ((mid - 1) >= 0 && nums[mid - 1] == nums[mid]) {
//				System.out.println("El: " + nums[mid] + " mid: " + mid);
//				duplicate = true;
//				System.out.println("Duplicate: " + duplicate);
//			} else if ((mid + 1) < nums.length && nums[mid + 1] == nums[mid]) {
//				System.out.println("El: " + nums[mid] + " mid: " + mid);
//				duplicate = true;
//				System.out.println("Duplicate: " + duplicate);
//			}
//		}
//
//		if (duplicate == false) {
//			min = nums[mid];
//			return min;
//		}
//
//		if ((mid - 1) >= 0 && nums[mid - 1] == nums[mid]) {
//			// Eliminate right half
//			high = mid - 1;
//		} else if ((mid + 1) < nums.length && nums[mid + 1] == nums[mid]) {
//			// Eliminate left half
//			low = mid + 1;
//		}
//	}
//	return min;
//}
