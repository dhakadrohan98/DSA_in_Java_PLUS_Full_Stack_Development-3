package com.coding.practice;

import java.util.*;

public class CountCharacterInString {

	public static void main(String[] args) {
		String str = "L2_Interview_Pankaj Kumar_Java_Developer_R0062185";
		String aux1 = "";
		String aux2 = "";
		
		String[] arr1 = str.split(" ");
		for(String temp: arr1) {
			aux1 = aux1 + temp;
		}
		
		String[] arr2 = aux1.split("_");
		for(String temp: arr2) {
			aux2 = aux2 + temp;
		}
		System.out.println(aux2);
		
		//count character on result
		Map<Character,Integer> hmap = new HashMap<>();
		
		for(int i=0; i<aux2.length(); i++) {
			char ch = aux2.charAt(i);
			
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			}
			else {
				hmap.put(ch, 1);
			}
		}
		System.out.println(hmap.entrySet());

	}

}
