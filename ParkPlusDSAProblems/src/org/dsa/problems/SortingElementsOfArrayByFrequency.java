package org.dsa.problems;

import java.util.*;

public class SortingElementsOfArrayByFrequency {
	//TC: O(N) + O(N*logN)
	//Sc: O(N) list
	public static int[] sortByFrequency(int[] nums) {
		int[] ans = new int[nums.length];

		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hmap.containsKey(nums[i])) {
				hmap.put(nums[i], hmap.get(nums[i]) + 1);
			} else {
				hmap.put(nums[i], 1);
			}
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		System.out.println("Given arr: ");
		System.out.println(list);
		Collections.sort(list, (n1, n2) -> {
			int freq1 = hmap.get(n1);
			int freq2 = hmap.get(n2);

			if (freq1 != freq2) {
				return freq2 - freq1; // (for descending order of map's values)
			} else {
				// compare elements n1 & n2 if both freq are equal.
				return n1 - n2; // (for ascending order of map keys)
			}
		});
		for (int i = 0; i < nums.length; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 5, 2, 8, 5, 6, 8, 9, 8, 11 };
		int[] nums1 = {1, 2, 3, 3, 2, 1, 1};
		int[] nums2 = {1, 3, 2, 2, 2, 3, 4, 3, 1};
		int[] nums3 = {6, 46, 2, 11};
		int[] sortByFrequency = sortByFrequency(nums);
		for(int val : sortByFrequency) {
			System.out.print(val + " ");
		}

	}

}
