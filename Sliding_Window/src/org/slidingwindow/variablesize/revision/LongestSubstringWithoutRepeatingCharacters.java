package org.slidingwindow.variablesize.revision;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
	
	 //TC: O(n)
    //SC: O(n)
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0, j = 0;
        int longest = 0;
        Map<Character, Integer> hmap = new HashMap<>();
        //without-repeating-characters -> All unique characters
        //current window -> shows All unique characters substring = j-i+1
        while(j < n) {
            char ch = s.charAt(j);
            //do some calculations
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
            //if map size is less than current window it means there any same extra characters
            //present in current window, now we have to shrink the window from left side
            if(hmap.size() < j - i + 1) {
                while(hmap.size() < j-i+1) {
                    char ichar = s.charAt(i);
                    hmap.put(ichar, hmap.get(ichar) - 1);

                    if(hmap.get(ichar) == 0) {
                        hmap.remove(ichar);
                    }
                    //slide the window
                    i++;
                }
            } else if(hmap.size() == j-i+1) { //current window(substring) are having all unique characters
                longest = Math.max(longest, j-i+1);
            }  // else if(hmap.size() > j-i+1) {} -> this condition will never occur
            j++;
        }
        return longest;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
