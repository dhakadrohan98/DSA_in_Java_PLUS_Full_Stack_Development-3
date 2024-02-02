package org.string.leetcode.mediumProblems;

import java.util.*;

public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
        Map<Character,Integer> hmap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
        	char ch = s.charAt(i);
        	if(hmap.containsKey(ch)) {
        		hmap.put(ch, hmap.get(ch)+1);
        	} else {
        		hmap.put(ch, 1);
        	}
        }
        System.out.println(hmap);
        
        for(int j=0; j<t.length(); j++) {
        	char ch = t.charAt(j);
        	
        	if(hmap.containsKey(ch) && hmap.get(ch) > 0) {
        		hmap.put(ch, hmap.get(ch)-1);
        	} else {
        		return false;
        	}
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		String s = "anagram", t = "nagaraa";
		System.out.println(isAnagram(s, t));

	}

}
