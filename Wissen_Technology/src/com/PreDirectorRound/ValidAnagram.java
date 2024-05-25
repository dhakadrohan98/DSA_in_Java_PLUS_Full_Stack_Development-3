package com.PreDirectorRound;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	//TC: O(2 * n)
	//SC: O(n)
	public boolean isAnagram(String s, String t) {
        //edge case
        if(s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> hmap = new HashMap<>();
        //store character frequency of s into map
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch,0) + 1);
        }
        
        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if(hmap.containsKey(ch)) {
                int val = hmap.get(ch);
                val = val - 1;
                if(val == 0) {
                    hmap.remove(ch);
                }
                else {
                    hmap.put(ch, val);
                }
            }
            else {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
