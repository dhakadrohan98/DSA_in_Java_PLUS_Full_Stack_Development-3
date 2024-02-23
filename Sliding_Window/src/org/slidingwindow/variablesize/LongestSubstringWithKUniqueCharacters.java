package org.slidingwindow.variablesize;

import java.util.HashMap;

public class LongestSubstringWithKUniqueCharacters {

	public static int longestkSubstr(String str, int k) {
		int max = 0;
		int i = 0, j = 0;
		// map contains the frequency of non-repeating character
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		while (j < str.length()) {
			//calculating ans.
			char ch = str.charAt(j);
			// count the frequency of each character in the map
			hmap.put(ch, hmap.getOrDefault(ch, 0)+1);
			
			if(hmap.size() < k) {
//				j++;
			} else if(hmap.size() == k) {
				max = Math.max(max, j-i+ 1);
			} else if(hmap.size() > k) {
				while(hmap.size() > k) {
					char tempCh = str.charAt(i);
					hmap.put(tempCh, hmap.get(tempCh)-1);
					if(hmap.get(tempCh) == 0) {
						hmap.remove(tempCh);
					}
					i++;
				}
			}
			j++;
		}

        return max;
    }
	
	public static void main(String[] args) {
		String str0 = "aabacbebebe";
		String str1 = "aabacbabebebe";
		int k = 3;
		System.out.println(longestkSubstr(str0, k));
		System.out.println(longestkSubstr(str1, k));

	}

}
