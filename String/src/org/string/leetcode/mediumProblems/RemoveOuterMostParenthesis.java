package org.string.leetcode.mediumProblems;

import java.util.Stack;

public class RemoveOuterMostParenthesis {

	public static String removeOuterParentheses(String s) {
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '(') {
				if (st.size() > 0) { // //curr ch is not outermost opening Parenthesis
					sb.append(ch);
				}
				st.push(ch);
			} else {
				st.pop();
				if (st.size() > 0) { // curr ch is not outermost closing parenthesis
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
