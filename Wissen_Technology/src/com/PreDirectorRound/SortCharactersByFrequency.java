package com.PreDirectorRound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair {
	char ch;
	int freq;

	Pair(char ch, int freq) {
		this.ch = ch;
		this.freq = freq;
	}
}

public class SortCharactersByFrequency implements Comparator<Pair> {

	@Override
	public int compare(Pair pair1, Pair pair2) {
		return pair2.freq - pair1.freq;
	}

	public static String frequencySort(String s) {
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> hmap = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			hmap.put(ch, hmap.getOrDefault(ch, 0)+1);
		}
		System.out.println(hmap);
		List<Pair> list = new ArrayList<>();
		for(char key: hmap.keySet()) {
			int val = hmap.get(key);
			list.add(new Pair(key, val));
		}
		Collections.sort(list, new SortCharactersByFrequency());
		
		for(int i=0; i<list.size(); i++) {
			Pair pair = list.get(i);
			char ch = pair.ch;
			int freq = pair.freq;
			while(freq > 0) {
				sb.append(ch);
				freq--;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "tree";
		System.out.println(frequencySort(s));

	}

}
