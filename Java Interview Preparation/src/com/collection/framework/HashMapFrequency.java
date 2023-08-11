package com.collection.framework;
import java.util.*;

public class HashMapFrequency {

	public static void main(String[] args) {
		
		char[] alphabets = {'a','b','c','d','e','f','g','h','b','c','g','h','e','z','x','y','z','c','d','x'};
		Map<Character,Integer> hmap = new HashMap<Character, Integer>();
		
		for(char ch:alphabets)
		if(hmap.containsKey(ch)) {
			hmap.put(ch, hmap.get(ch)+1);
		}
		else {
			hmap.put(ch, 1);
		}
		hmap.putIfAbsent('p',1);
		hmap.putIfAbsent('a', 22);
		
		
		System.out.println("Frequency map: "+hmap);
		
		for(char key:hmap.keySet()) {
			System.out.print(key+" ");
		}
		
		
		System.out.println(hmap.entrySet());
	}
}
