package org.slidingwindow.variablesize.revision;

import java.util.*;
public class LongestSubstringWithKUniques {

	//Source: GFG
	 //TC: O(n)
    //SC: O(1)
    public int longestkSubstr(String s, int k) {
        int i = 0, j = 0;
        int n = s.length();
        int longest = -1;
        Map<Character, Integer> hmap = new HashMap<>();
        
        while(j < n) {
            //do some calculation
            char ch = s.charAt(j);
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
            
            if(hmap.size() < k) {
                j++;
            } else if(hmap.size() == k) {
                //do calculatio for ans
                longest = Math.max(longest, j-i+1);
                j++;
            } else if(hmap.size() > k) {
                //remove calculation for i
                while(hmap.size() > k) {
                    char ichar = s.charAt(i);
                    hmap.put(ichar, hmap.get(ichar) - 1);
                    if(hmap.get(ichar) == 0) {
                        hmap.remove(ichar);
                    }
                    i++;
                }
                //check for potential candidate(ans)
                if(hmap.size() == k) {
                    longest = Math.max(longest, j-i+1);
                }
                j++;
            }
        }
        return longest;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
