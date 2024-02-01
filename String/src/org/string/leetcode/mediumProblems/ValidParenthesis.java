package org.string.leetcode.mediumProblems;

import java.util.Stack;

public class ValidParenthesis {
	
	public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == '(') {
                if(st.size() > 0) { //curr character is not outermost opening bracket
                    sb.append(ch);
                }
                st.push(ch);
                } else {
                    st.pop();
                    if(st.size() > 0) { //curr character is not outermost closing                                                  //bracket
                    sb.append(ch);
                    }
                
                }
         }
         return sb.toString();
    }
	
	public static void main(String[] args) {
		String str = "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(str));

	}

}
