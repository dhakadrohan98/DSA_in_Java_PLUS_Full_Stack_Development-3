package com.PreDirectorRound;

import java.util.*;

public class IsomorphicString {
	// TC: O(n)
	// SC: O(2*n)
	public boolean isIsomorphic(String s, String t) {
		// edge case
		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Character> hmap1 = new HashMap<>();
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			// check in map2 first
			if (hmap1.containsKey(ch1)) {
				char val2 = hmap1.get(ch1);
				if (val2 != ch2) { //check if value of already present key is changing
					return false;
				}
			} else if (!set.contains(ch2)) { //No two characters may map to the same character
				set.add(ch2);
				hmap1.put(ch1, ch2);
			} else {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
