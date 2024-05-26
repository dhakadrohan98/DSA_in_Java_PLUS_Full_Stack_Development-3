package org.arrays.stringPracticeProblems;

import java.util.*;

public class LongestConsecutiveSequence {
	//TC: O(2*n)
	//SC: O(n)
	public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val: nums) {
            set.add(val);
        }

        int max = 0;
        
        for(int val: set) {
            if(!set.contains(val-1)) {
                int count = 1;
                int temp = val;
                while(set.contains(temp+1)) {
                    temp += 1;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
