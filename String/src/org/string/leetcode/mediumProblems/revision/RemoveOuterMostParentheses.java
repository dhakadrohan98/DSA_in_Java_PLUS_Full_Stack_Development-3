package org.string.leetcode.mediumProblems.revision;

import java.util.*;

public class RemoveOuterMostParentheses {
	
	//TC: O(n)
    //SC: O(n)
	public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char currCh = s.charAt(i);
            if(!st.isEmpty()) {
                if(currCh == '(') {
                    sb.append(currCh);
                    st.push(currCh);
                }
                else if(currCh == ')' && st.peek() == '(') {
                    char secondChar = st.pop();
                    if(!st.isEmpty()) {
                        sb.append(currCh);
                    }
                }
            } else {
                st.push(currCh);
            }
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
