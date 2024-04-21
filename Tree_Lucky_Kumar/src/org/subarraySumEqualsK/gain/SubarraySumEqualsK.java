package org.subarraySumEqualsK.gain;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
	public int findSubarraySum(int[] nums, int k) {
		int sum = 0;
		int result = 0;
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		hmap.put(0, 1);
		
		for(int i=0; i<nums.length; i++) {
			//calculating cumulative sum
			sum += nums[i];
			if(hmap.containsKey(sum - k)) {
				result += hmap.get(sum - k);
			}
			hmap.put(sum, hmap.getOrDefault(sum, 0)+1);
		}
		return result;
	}
}
