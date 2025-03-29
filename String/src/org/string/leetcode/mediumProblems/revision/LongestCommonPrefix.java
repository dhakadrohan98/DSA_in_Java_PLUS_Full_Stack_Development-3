package org.string.leetcode.mediumProblems.revision;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	//TC: O(n * logn)
    //SC: O(max(len1,len2)) where len1 is length of first character & len2 is the length of last character
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int len = Math.min(first.length(), last.length());
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < len; i++) {
            char ch1 = first.charAt(i);
            char ch2 = last.charAt(i);
            if(ch1 == ch2) {
                sb.append(ch1);
            } else {
                break;
            }
        }
        return sb.toString();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
