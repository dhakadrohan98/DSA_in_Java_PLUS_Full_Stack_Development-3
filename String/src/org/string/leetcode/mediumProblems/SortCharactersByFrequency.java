package org.string.leetcode.mediumProblems;

import java.util.*;

class Pair {
	char ch;
	int freq;

	Pair(char ch, int freq) {
		this.ch = ch;
		this.freq = freq;
	}
}

public class SortCharactersByFrequency {

	public static String frequencySort(String s) {
		Map<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		}
		int len = s.length();
		// creating bucket of ArrayList
		List<Character>[] bucket = new List[len + 1];
		// Iterate through hmap
		for (Character key : hmap.keySet()) {
			int frequency = hmap.get(key);
			if (bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<>();
			}
			// adding character into bucket at frequency position.
			bucket[frequency].add(key);
		}

//		for(int j=0; j<bucket.length; j++) {
//			System.out.println(bucket[j]);
//		}

//		
		StringBuilder sb = new StringBuilder();
//		//Iterate through bucket
		for (int i = bucket.length - 1; i >= 0; i--) {
			if (bucket[i] != null) {
				// Iterate through list at bucket[i]
				for (char ch : bucket[i]) {
					for (int k = 1; k <= hmap.get(ch); k++) {
						sb.append(ch);
					}
				}
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "mississippi";
		System.out.println(frequencySort(str));

	}

}
