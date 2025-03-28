package org.string.leetcode.mediumProblems.revision;

import java.util.*;

class Pair {
	char ch;
	int freq;

	Pair(char ch, int freq) {
		this.ch = ch;
		this.freq = freq;
	}
}

public class SortCharactersByFrequency_Rev implements Comparator<Pair> {
	
	public int compare(Pair p1, Pair p2) {
		//sort in the decreasing order of freq
		return p2.freq - p1.freq;
	}

	public static String frequencySort(String s) {
		Map<Character, Integer> hmap = new HashMap<>();
		for (char ch : s.toCharArray()) {
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		}
		List<Pair> list = new ArrayList<>();

		for (char key : hmap.keySet()) {
			list.add(new Pair(key, hmap.get(key)));
		}
		Collections.sort(list, new SortCharactersByFrequency_Rev());
		StringBuilder sb = new StringBuilder();
		for (Pair pair : list) {
			int freq = pair.freq;
			char ch = pair.ch;
			System.out.print(ch + " - " + freq);
			System.out.println();

			while (freq-- > 0) {
				sb.append(ch);
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
//		int diff = 'z' - 'a';
//		System.out.println(diff);
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(frequencySort(str));
	}

}
