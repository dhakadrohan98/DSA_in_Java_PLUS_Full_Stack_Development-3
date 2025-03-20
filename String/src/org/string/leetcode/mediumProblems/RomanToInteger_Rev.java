package org.string.leetcode.mediumProblems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_Rev {
	
	//TC: O(n)
    //SC: O(1) ~ some space taken by while making an map
	public static int romanToInt(String s) {
        Map<String, Integer> hmap = new HashMap<>();
        hmap.put("I", 1);
        hmap.put("V", 5);
        hmap.put("X", 10);
        hmap.put("L", 50);
        hmap.put("C", 100);
        hmap.put("D", 500);
        hmap.put("M", 1000);
        hmap.put("IV", 4);
        hmap.put("IX", 9);
        hmap.put("XL", 40);
        hmap.put("XC", 90);
        hmap.put("CD", 400);
        hmap.put("CM", 900);
        int number = 0;
        int i = s.length() - 1;
        while(i > 0) {
        	StringBuilder sb = new StringBuilder();
        	sb.append(s.charAt(i-1));
        	sb.append(s.charAt(i));
            if(hmap.containsKey(sb.toString())) {
            	number += hmap.get(sb.toString());
            	i -= 2;
            } else {
            	String chstr = s.charAt(i)+"";
            	number += hmap.get(chstr);
            	i -= 1;
            }
            
            System.out.println("number - " + number);
        }
        if(i == 0) {
            number += hmap.get(s.charAt(0)+"");
        }
        return number;

    }
	
	public static void main(String[] args) {
		String s = "DCXXI";
		//         1000+900+90+4 = 1994
		System.out.println(romanToInt(s));
	}

}
