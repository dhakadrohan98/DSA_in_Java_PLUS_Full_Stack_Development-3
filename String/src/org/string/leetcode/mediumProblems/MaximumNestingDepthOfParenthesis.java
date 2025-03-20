package org.string.leetcode.mediumProblems;

import java.util.Stack;

public class MaximumNestingDepthOfParenthesis {
	//TC: O(n)
    //SC: O(n)
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        int maxi = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                st.push(ch);
                count++;
            } else if(ch == ')') {
                maxi = Math.max(maxi, count);
                count--;
                st.pop();
            }
        }
        return maxi;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
