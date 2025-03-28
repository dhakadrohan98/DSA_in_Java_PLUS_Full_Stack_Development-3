package org.leetcodemedium.arr.revision;

import java.util.*;
public class LongestConsecutiveSequence {
	
	//TC: O(2n)
    //SC: O(n)
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int longest = 0;

        for(int val : set) {
            //not first number of a new sequence
            if(set.contains(val-1)) {
                continue;
            } else {
                //yes it is first number of a new sequence, start calculating length of this
                //this new sequence
                int tempVal = val;
                int length = 1;
                while(set.contains(tempVal + 1)) {
                    length += 1;
                    tempVal += 1;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
