package org.string.leetcode.mediumProblems;

import java.util.*;

public class Isomorphic {

	public static boolean isIsomorphic(String s, String t) {
		LinkedHashMap<String,String> hmap = new LinkedHashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            String s1 = s.charAt(i)+"";
            String t1 = t.charAt(i)+"";
            if(!hmap.containsKey(s1)) {
            	hmap.put(s1, t1);
            }
        }
        System.out.println(hmap);
        
        for(int j=0; j<t.length(); j++) {
        	String s11 = s.charAt(j)+"";
        	String t11 = t.charAt(j)+"";
        	System.out.println(hmap.get(s11)+" "+t11);
        	if(t11.equals(hmap.get(s11))) {
        		continue;
        	} else {
        		return false;
        	}
        	
        }
        return true;
    }
	
	public static boolean isIsomorphic1(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		Map<Character,Character> hmap1 = new HashMap<>();
		Map<Character,Boolean> hmap2 = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(hmap1.containsKey(ch1)) {
            	if(hmap1.get(ch1) != ch2) { //value of ch1 from map1 is not equal to ch2
            		return false;
            	}
            } else if(hmap2.containsKey(ch2)) {
            	return false; //2nd map has used ch1
            } else {
            	hmap1.put(ch1, ch2);
            	hmap2.put(ch2, true);
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		String str1 = "egg";
		String str2 = "add";
		System.out.println(isIsomorphic(str1, str2));
	}

}
