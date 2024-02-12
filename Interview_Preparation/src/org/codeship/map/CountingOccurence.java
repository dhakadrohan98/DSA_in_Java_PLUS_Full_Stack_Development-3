package org.codeship.map;

import java.util.*;

public class CountingOccurence {

	public static void main(String[] args) {
		Map<Character,Integer> hmap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
//			char caseChange=(Character) null;
//			if(ch>=65 && ch<=90) {
//				caseChange = (char) (ch + 32);
//			} else if(ch>=97 && ch<=122) {
//				caseChange = (char) (ch - 32);
//			}
			
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			}
			else {
				hmap.put(ch, 1);
			}
		}
		
		for(char ch:hmap.keySet()) {
			System.out.print(ch+",");
		}
		System.out.println();
		for(int temp:hmap.values()) {
			System.out.print(temp+", ");
		}
		System.out.println();
		
//		System.out.println("Iterating Hashmap through Map.Entry type and map.entrySet() method");  
//		for(Map.Entry m: hmap.entrySet() ) {
//			System.out.println("Key: "+m.getKey()+", Value: "+m.getValue());
//		}
		
		System.out.println(hmap);
		

	}

}
