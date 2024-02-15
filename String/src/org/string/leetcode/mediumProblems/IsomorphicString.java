package org.string.leetcode.mediumProblems;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static boolean isIsomorphic(String s, String t) {
		// edge case
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Character> hmap1 = new HashMap<>();
		Map<Character, Boolean> hmap2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			
			if(!hmap2.containsKey(ch1)) {
				hmap2.put(ch1, true);
				
				if(!hmap1.containsKey(ch1)) {
					hmap1.put(ch1, ch2);
				}
			} else {
				if(!hmap1.containsKey(ch1)) {
					hmap1.put(ch1, ch2);
				} else {
					if(ch2 != hmap1.get(ch1)) {
						return false;
					}
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {
		String s = "abacba";
		String t = "xywzyx";
		
		System.out.println(isIsomorphic(s, t));

	}

}
