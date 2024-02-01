package org.string.leetcode.mediumProblems;

public class ReverseWords {

	public static String reverseWords(String s) {
		 String[] words = s.trim().split(" ");
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i=words.length - 1; i >= 0; i--) {
	        	System.out.println("ith word: " + i + " " + words[i]);
	            if(words[i].length() > 0) {
	                sb.append(words[i]);
	                sb.append(' ');
	            }
	        }
	        
	        return sb.substring(0, sb.length()-1).toString();
    }
	
	public static void main(String[] args) {
		String str = "a good   example";
		System.out.println(reverseWords(str));
	}

}

//public String reverseWords(String s) {
//String rev = "";
//String temp = "";
//int i = s.length()-1;
//
//while(i >= 0) {
//    char ch = s.charAt(i);
//    if(ch == ' ') {
//        i--;
//    } else if(i > 0 && s.charAt(i-1) != ' ') {
//        temp = temp + ch;
//        i--;
//    } else if(i > 0 && s.charAt(i-1) == ' ') {
//        temp = temp + ch;
//        rev = rev + temp + " ";
//        temp="";
//        i--;
//    } else if(i == 0 && ch != ' ') {
//        temp = temp + ch;
//        rev = rev + temp;
//        i--;
//    }
//}
//
//return rev;
//}

//Your input:
//"the sky is blue"
//Output:
//"eulb si yks eht"
