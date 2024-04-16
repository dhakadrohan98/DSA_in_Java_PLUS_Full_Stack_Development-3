package org.binary.tree;

import java.util.*;

public class RecoverATreeFromPreorderTraversal {

	public static TreeNode recoverFromPreorder(String S) {
		Stack<TreeNode> stk = new Stack<>();
		for (int i = 0; i < S.length();) {
			int level = 0;
			while (S.charAt(i) == '-') {
				level++;
				i++;
			}
			int start = i;
			while (i < S.length() && Character.isDigit(S.charAt(i))) {
				i++;
			}
			int val = Integer.parseInt(S.substring(start, i));
			System.out.println(val + " level is " + level);
			// Now we have level information for each digit of the given string
			// System.out.println(val + " level is " + level);
			TreeNode tmp = new TreeNode(val);
			if (stk.isEmpty()) {
				System.out.println("one time inside this if condition");
				stk.push(tmp);
				continue;
				// Skip the below steps because we have pushed the root node into the stack
			}
			while (stk.size() > level) { // To find parent for the current tmp node
				stk.pop();
			}
			if (stk.peek().left == null) {
				stk.peek().left = tmp;
			} else {
				stk.peek().right = tmp;
			}
			// Push the current tmp into the stack
			stk.push(tmp);
		}
		// To find the root of the constructed tree
		while (stk.size() > 1) {
			stk.pop();
		}
		return stk.peek();
	}

	public static void main(String[] args) {
		String s = "1-2--3--4-5--6--7";
		TreeNode temp = recoverFromPreorder(s);
		System.out.println(temp.val);

	}

}
