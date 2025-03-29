package org.string.leetcode.mediumProblems.revision;

//Author - Rohan Dhakad
// 127/196 test cases are passed
public class LargestOddNumberInString_NP {
	
	public String largestOddNumber(String s) {
        long num = 0;
        long ans = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val = ch - '0';
            num = num * 10 + val;
            if(num % 2 != 0) {
                ans = num;
            }
        }
        //edge case
        //no odd number is found
        if(ans == 0) {
            return "";
        }
        return String.valueOf(ans);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
