package org.string.leetcode.mediumProblems;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] str) {
        Arrays	.sort(str);
        String result="";
		String str1 = str[0];
        String str2 = str[str.length-1];
        int end = 0;
        //Compare characters of first & last string only after sortings
        if(str1.length() > str2.length()) {
            end =  str2.length()-1;
        } else {
            end = str1.length()-1;
        }
        
        for(int i=0; i<=end; i++) {
            if(str1.charAt(i) == str2.charAt(i)) {
                result = result + str1.charAt(i);
            } else {
                return result;
            }
        }
		
        
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

