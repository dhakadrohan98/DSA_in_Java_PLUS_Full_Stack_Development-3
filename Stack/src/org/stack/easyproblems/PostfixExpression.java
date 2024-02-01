package org.stack.easyproblems;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class PostfixExpression {

	//Function to evaluate a postfix expression.
    public static int evaluatePostFix(String str)
    {
    	int res = 0;
    	//set containing operators
    	Set<Character> set = new HashSet<>();
    	set.add('+');
    	set.add('-');
    	set.add('*');
    	set.add('/');
    	
    	Stack<Integer> stack = new Stack<>();
    	
    	for(int i=0; i<str.length(); i++) {
    		char ch = str.charAt(i);
    		if(!set.contains(ch)) { //it is not a operator
    			int temp =Character.getNumericValue(ch);   
    			stack.push(temp);
    		}
    		else {
    			int n1 = stack.pop();
    			int n2 = stack.pop();
    			
    			if(ch == '+') {
    				res = n2 + n1;
    			} else if(ch == '-') {
    				res = n2 - n1;
    			} else if(ch == '*') {
    				res = n2 * n1;
    			} else if(ch == '/') {
    				res = n2 / n1;
    			}
    			stack.push(res);
    		}
    	}
    	return res;
    }
    
	public static void main(String[] args) {
		String str = "123+*8-";
		int evaluatePostFix = evaluatePostFix(str);
		System.out.println(evaluatePostFix);
	}

}
