package faangm;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfSubarraySumEqualsK {
	 //TC: O(n * logn) in worst case
    //SC: O(n)
	public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, 1);
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            int remain = sum - k;
            if(hmap.containsKey(remain)) {
                count += hmap.get(remain);
            }
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
