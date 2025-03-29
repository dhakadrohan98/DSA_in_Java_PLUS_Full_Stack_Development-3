package org.string.leetcode.mediumProblems.revision;

import java.util.*;
public class IsomorphicStrings {
	
	//TC: O(n)
    //SC: O(2n)
    public boolean isIsomorphic(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        //edge case
        if(len1 != len2) {
            return false;
        }
        Map<Character, Character> hmap1 = new HashMap<>();
        Map<Character, Boolean> hmap2 = new HashMap<>();
        for(int i = 0; i < len1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(!hmap1.containsKey(ch1)) {
                hmap1.put(ch1, ch2);
                //if char at T is already used then return false;
                if(hmap2.containsKey(ch2)) {
                    return false;
                }
                hmap2.put(ch2, true);
            } else {
                char match = hmap1.get(ch1);
                if(match != ch2) {
                    return false;
                } else {
                    //move i one step ahead
                }
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
