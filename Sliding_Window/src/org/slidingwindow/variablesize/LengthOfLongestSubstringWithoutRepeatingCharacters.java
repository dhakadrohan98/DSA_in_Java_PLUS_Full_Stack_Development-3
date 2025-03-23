package org.slidingwindow.variablesize;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringWithoutRepeatingCharacters {

	public static int longestUniqueSubsttr(String str) {
		int max = 0;
		int count = 0;
		int i = 0, j = 0;
		// map contains the frequency of non-repeating character
		HashMap<Character, Integer> hmap = new HashMap<>();

		while (j < str.length()) {
			char ch = str.charAt(j);
			// count the frequency of each character in the map.
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);

			// If hmap.size are less than (j-i+1), it means some characters got repeated in
			// the substring,
			// first we need to remove the count of character by 1 at i^th index &
			// check whether its character count becomes 0, If yes then remove character
			// from hmap and increase the value of j pointer by 1, otherwise only increase
			// the value of j pointer by 1.

			// Repeat the above steps until the map size is less than (j-i+1)
			if (hmap.size() < j - i + 1) {
				while (hmap.size() < j - i + 1) {
					hmap.put(str.charAt(i), hmap.get(str.charAt(i)) - 1);
					if (hmap.get(str.charAt(i)) == 0) {
						hmap.remove(str.charAt(i));
					}
					i++;
				}

			} // once the map size becomes equal to j-i+1 it means substring(i,j) contains
				// non-repeating characters
				// Then take max of {previousMax, (j - i + 1)} substring length to keep track of
				// longest substring according
				// to question.
			else if (hmap.size() == j - i + 1) {
				
				max = Math.max(max, j - i + 1);
			}
			// Then finally increase the value of j by 1 after the above two conditions.
			j++;
		}
		return max;
	}

	public static void main(String[] args) {
		String str = "pwwkew";
		String str1 = "geeksforgeeks";
		System.out.println(longestUniqueSubsttr(str1));

	}

}

//Human resocia interview questions:

//		main logic
//			int firstMax = lines[0];
//			int secondMax  lines[0];
//			//first maximum & second maximum
//			for (int i = 1; i < index; ++i) {
//		        
//				if(lines[i] > firstMax) {
//					secondMax = firstMax;
//					firstMax = lines[i];
//				}
//				
//				else if(lines[i]  > secondMax && lines[i] < firstMax) {
//					secondMax = lines[i];
//				}
//		    }
//			
//			for(int i=0; i<index; i++) {
//				if(lines[i] != firstMax) {
//					printf("%s", firstMax);
//				}
//				else if(lines[i] == firstMax && lines[i] != secondMax) {
//					printf("%s", secondMax);
//				}
//			}

//public static int longestUniqueSubsttr(String str){
//    int max = 0;
//    int count = 0;
//    int i = 0, j = 0;
//    Set<Character> set = new HashSet<Character>();
//    
//    while(j < str.length()) {
//    	
//    	set.add(str.charAt(j));
//    	
//    	if(j-i+1 >= set.size()) {
//    		count += 1;
//    		System.out.println("count: " + count);
//    		j++;
//    	}
//    	else if (j-i+1 < set.size()) {
//    		max = Math.max(max, count);
//    		System.out.println("max: " + max);
//    		i++;
//    		j++;
//    	}
//    }
//    
//    return max;
//}
