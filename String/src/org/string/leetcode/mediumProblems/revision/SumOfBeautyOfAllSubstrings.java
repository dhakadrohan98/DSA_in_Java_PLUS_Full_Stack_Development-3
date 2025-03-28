package org.string.leetcode.mediumProblems.revision;

import java.util.*;

//Time Limit Exceed(TLE)
// 42/57 test cases are passed
public class SumOfBeautyOfAllSubstrings {
	
	public int beautySum(String s) {
        int n = s.length();
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                String substr = s.substring(i, j+1);
                Map<Character, Integer> hmap = new HashMap<>();
                int m = substr.length();
                //count freq of characters of each substring instead of prefix sum 
                for(int k = 0; k < m; k++) {
                    char ch = substr.charAt(k);
                    hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
                }
                //iterate over hmap keys & find the diff b/w maxFreq - minFreq characters
                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;
                for(char ch : hmap.keySet()) {
                    int val = hmap.get(ch);
                    maxFreq = Math.max(maxFreq, val);
                    minFreq = Math.min(minFreq, val);
                }
                if(maxFreq != Integer.MIN_VALUE && minFreq != Integer.MAX_VALUE) {
                    count += (maxFreq - minFreq);
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
