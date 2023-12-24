package org.string;

import java.util.Arrays;

public class LongestCommonPrefixMediumLevelLeetcode {
	
	public static String longestCommonPrefix(String[] str) {
		Arrays.sort(str);
		String result="";
		System.out.println("String array length: "+str.length);
		for(int i=0; i<str.length; i++) {
			System.out.println("9. count : "+ (i+1));
			String curr = str[i];
			System.out.println("11. current string: "+curr);
			if(i==0) {
				result = str[i];
			} else {
				String secondTemp = ""; 
				for(int j=0; j<curr.length() && j < result.length(); j++) {
					if(curr.charAt(j) == result.charAt(j)) {
						secondTemp = secondTemp + curr.charAt(j);
						System.out.println("19. secondTemp:"+secondTemp);
					} else {
						result = secondTemp;
						System.out.println("22. result in else block: "+ result);
						curr="";
						break;
					}
				} //for(j) loop
			} //else (parent)
		} //outer for(i) loop
		return result;
	}

	public static void main(String[] args) {
//		String[] str = {"cluster","clue","clutch","club","clumsy"};
		String[] str = {"ab","a"};
		String longestCommonPrefix = longestCommonPrefix(str);
		System.out.println("Final ans:"+longestCommonPrefix);

	}

}
