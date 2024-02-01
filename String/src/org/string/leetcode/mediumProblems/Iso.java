package org.string.leetcode.mediumProblems;

import java.util.HashMap;
import java.util.Map;

public class Iso {
	 public static boolean isIsomorphic(String s, String t) {
	        Map<Character,Character> hmap1 = new HashMap<>();
	        
	        for(int i=0; i<s.length(); i++) {
	            Character ch1 = s.charAt(i);
	            Character ch2 = t.charAt(i);
	            hmap1.put(ch1, ch2);
	         }
	        
	        return true;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
