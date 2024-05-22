package com.PreDirectorRound;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class PostfixExperssion {
	//Function to evaluate a postfix expression.
    public static int evaluatePostFix(String str)
    {
        Stack<Integer> st = new Stack<>();
        Set<Character> set = new HashSet<>();
        int n = str.length();
        //set will contain arithmetic operators
        set.add('*');
        set.add('/');
        set.add('+');
        set.add('-');
        
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            //curr char is not arithemtic operator
            if(!set.contains(ch)) {
                st.push(Character.getNumericValue(ch));
            }
            else {
                int second = st.pop();
                int first = st.pop();
                int res = 0;
                if(ch == '*') {
                    res = first * second;
                }
                if(ch == '/') {
                    res = first / second;
                }
                if(ch == '+') {
                    res = first + second;
                }
                if(ch == '-') {
                    res = first - second;
                }
                st.push(res);
            }
        }
        return st.pop();
    }
    
    public static void main(String[] args) {}
}
