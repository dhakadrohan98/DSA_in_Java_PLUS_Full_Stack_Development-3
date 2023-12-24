package org.string;

import java.util.*;

public class AlernatingStringNotPassedTestCase {

	public static void main(String[] args) {
		String str="110010";
		//		str += '2';
//		System.out.println(str.length());
		int iterativeMinOperation = 0;
		int hmapMinOperation = 0;
		
		Map<Character,Integer> hmap = new HashMap<>();
		
		for(int k=0; k<str.length(); k++) {
			char ch = str.charAt(k);
			
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			}
			else {
				hmap.put(ch, 1);
			}
		}
		System.out.println(hmap);
			
		//hmap min operations 
		for(int k=0; k<str.length(); k++) {
			char ch = str.charAt(k);
			
			int frequency = hmap.get(ch);
			hmapMinOperation = frequency/2;
		}
		
		//Iterative operations
        for(int i=0,j=1; i<str.length()-1 && j<str.length(); i++,j++) {
            char first = str.charAt(i);
            char next = str.charAt(j);
            
            if(first==next) {
            	iterativeMinOperation += 1;
            }
        }
        System.out.println("hmap Min Operation operation: "+ hmapMinOperation);
        System.out.println("iterative Min Operation operation: "+ iterativeMinOperation);
        
        System.out.println();
        if(hmapMinOperation < iterativeMinOperation) {
        	System.out.println("Min operation: "+ hmapMinOperation);
        } else {
        	System.out.println("Min operation: "+ iterativeMinOperation);
        }
        
//        System.out.println("No. of Iterative min operation: "+iterativeMinOperation);

	}

}
