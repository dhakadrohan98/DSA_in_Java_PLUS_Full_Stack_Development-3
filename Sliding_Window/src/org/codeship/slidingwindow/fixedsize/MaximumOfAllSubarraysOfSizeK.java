package org.codeship.slidingwindow.fixedsize;

import java.util.ArrayList;
import java.util.List;

public class MaximumOfAllSubarraysOfSizeK {

	public static List<Integer> maximumOfAllSubarraysOfSizeK(int[] nums, int k) {
		List<Integer> ans = new ArrayList<Integer>();
		if (k > nums.length) {
			ans.add(0);
		}

		List<Integer> list = new ArrayList<Integer>();
		int i = 0, j = 0;

		while (j < nums.length) {
			// calculate ans
			int lastPos = list.size() - 1;

			while (list.size() > 0 && list.get(lastPos) < nums[j]) {
				list.remove(lastPos);
				lastPos = list.size() - 1;
			}
			list.add(nums[j]);

			if (j - i + 1 < k) {
				j++;
			} else if (j - i + 1 == k) {
				ans.add(list.get(0));

				if (list.get(0) == nums[i]) {
					list.remove(0);
				}
				i++;
				j++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		System.out.println(maximumOfAllSubarraysOfSizeK(nums, k));
	}

}
