package org.codeship.slidingwindow.fixedsize.revision;

import java.util.*;

public class CountOccurencesOfAnagram {
	//TC: O(n)
    //SC: O(k)
	public static int search(String pat, String txt) {
        Map<Character, Integer> hmap2 = new HashMap<>();
        int k = pat.length();
        int i = 0, j = 0;
        int count = 0;
        //insert all characters of pat into the map1
//        Map<Character, Integer> hmap1 = new HashMap<>();
        for(int l = 0; l < pat.length(); l++) {
        	char ch = pat.charAt(l);
        	hmap2.put(ch, hmap2.getOrDefault(ch, 0) + 1);
        }
        //keep track if all character's count has become zero into the map, why we need it because we don't want to traverse 
        //the map again & again otherwise it will add complexity of O(k) inside while loop
        int distinctCharCount = hmap2.size();
        
        while(j < txt.length()) {
        	//do some calculation
            char ch = txt.charAt(j);
            if(hmap2.containsKey(ch)) {
                hmap2.put(ch, hmap2.get(ch) - 1);
                if(hmap2.get(ch) == 0) {
                	distinctCharCount--;
                }
            }
            //lesser than window size
            if(j -i+1 < k) {
                j++;
            } else if(j-i+1 == k) { //window size is hitted
                //do some calculation for ans
            	//if all characters inside has 0 value
                if(distinctCharCount == 0) {
                    count++;
                }
                //add calculation for i
                char ichar = txt.charAt(i);
                if(hmap2.containsKey(ichar)) {
                	hmap2.put(ichar, hmap2.get(ichar) + 1);
                	if(hmap2.get(ichar) == 1) {
                    	distinctCharCount++;
                    }
                }
                //slide the window
                i++;
                j++;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		String txt = "forxxorfxdofr";
		String pat = "for";
		String txt1 = "aabaabaa", pat1 = "aaba";
		System.out.println(search(pat1, txt1));

	}

}
