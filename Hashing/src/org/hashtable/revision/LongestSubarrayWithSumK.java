package org.hashtable.revision;

import java.util.*;
public class LongestSubarrayWithSumK {
	
	  //TC: O(n)
    //SC: O(n)
    public int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int n = arr.length;
        int longest = 0;
        int prefixSum = 0;
        
        for(int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if(prefixSum == k) {
                longest = Math.max(longest, i+1);
            } else if(hmap.containsKey(prefixSum - k)) {
                longest = Math.max(longest, i - hmap.get(prefixSum - k));
            }
            //prefixSum entry should be present from left most side of the array
            //if we get same prefixSum later then we don't have to update the
            //existing key, keep remain intact with prev index value, So we can get
            //longest subarray with sum k
            if(!hmap.containsKey(prefixSum)) {
                hmap.put(prefixSum, i);
            }
        }
        
        return longest;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
