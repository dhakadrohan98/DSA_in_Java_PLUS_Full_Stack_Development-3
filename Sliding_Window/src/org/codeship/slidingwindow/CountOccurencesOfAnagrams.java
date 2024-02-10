package org.codeship.slidingwindow;

import java.util.*;

public class CountOccurencesOfAnagrams {

	public static int search(String pat, String txt) {

		Map<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < pat.length(); i++) {
			char ch = pat.charAt(i);
			if (hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) + 1);
			} else {
				hmap.put(ch, 1);
			}
		}
		System.out.println(hmap);

		int i = 0, j = 0;
		int distinctCharacterCount = hmap.size();
		int k = pat.length();
		int ans = 0;

		while (j < txt.length()) {
			// calculation
			char ch = txt.charAt(j);
			if (hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) - 1);
			}

			if (hmap.containsKey(ch) && hmap.get(ch) == 0) {
				distinctCharacterCount--;
			}

			if (j - i + 1 < k) { //// window size is less than k
				j++;
			} else if (j - i + 1 == k) { // window size is equal to k.
				// calculation
				if (distinctCharacterCount == 0) {
					ans++;
				}
				// calculation for ith index before moving it ahead by one step.
				char ichar = txt.charAt(i);
				if (hmap.containsKey(ichar)) {
					hmap.put(ichar, hmap.get(ichar) + 1);
					if (hmap.get(ichar) == 1) {
						distinctCharacterCount++;
					}
				}
				i++;
				j++;
			}
			System.out.println("at " + j + " : " + hmap);
		}
		return ans;
	}

	public static void main(String[] args) {
		String txt = "aabaabaa";
		String pat = "aaba";

		String txt1 = "forxxorfxdofr";
		String pat1 = "for";
		System.out.println(search(pat1, txt1));

	}

}

//String str = "";
//for(int i=0; i<txt.length(); i++) {
//	char ch = txt.charAt(i);
//	if(hmap.containsKey(ch)) {
//		str += ch;
//	}
//}
//System.out.println(str);

//public static int search(String pat, String txt) {
//	
//	Map<Character, Integer> hmap = new HashMap<>();
//	for(int i=0; i<pat.length(); i++) {
//		char ch = pat.charAt(i);
//		if(hmap.containsKey(ch)) {
//			hmap.put(ch, hmap.get(ch)+1);
//		} else {
//			hmap.put(ch, 1);
//		}
//	}
//	System.out.println(hmap);
//	
//	int count = 0;
//	int i = 0, j = 0;
//	int distinctCharacterCount = hmap.size();
//	int k = pat.length();
//	int ans = 0;
//
//	while (j < txt.length()) {
//		//calculation
//		char ch = txt.charAt(j);
//		if(hmap.containsKey(ch)) {
//			hmap.put(ch, hmap.get(ch)-1);
//		}
//		
//		if(hmap.containsKey(ch) && hmap.get(ch) == 0) {
//			distinctCharacterCount--;
//		}
//		
//		if(j-i+1 < k) { ////window size is less than k
//			j++;
//		} else if(j-i+1 == k) { //window size is equal to k.
//			//calculation
//			if(distinctCharacterCount == 0) {
//				ans++;
//			}
//			//calculation for i
//			char ch1 = txt.charAt(i);
//			if(hmap.containsKey(ch1)) {
//				hmap.put(ch, hmap.get(ch)+1);
//				if(hmap.get(ch1) == 1) {
//					distinctCharacterCount++;
//				}
//			}
//			i++;
//			j++;
//		}
//	}
//	
//	
//	return ans;
//}
