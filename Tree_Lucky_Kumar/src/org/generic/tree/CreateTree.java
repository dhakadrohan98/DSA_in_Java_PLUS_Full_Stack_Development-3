package org.generic.tree;

import java.util.*;

public class CreateTree {

	public static void main(String[] args) {
		TreeNode1 first = new TreeNode1(4);
		TreeNode1 second = new TreeNode1(5);
		TreeNode1 third = new TreeNode1(6);
		TreeNode1 fourth = new TreeNode1(1);
		TreeNode1 fifth = new TreeNode1(2);
		TreeNode1 sixth = new TreeNode1(3);
		
		List<TreeNode1> firstNodeChild = new ArrayList<>();
		firstNodeChild.add(second);
		firstNodeChild.add(third);
		firstNodeChild.add(fourth);
		
		List<TreeNode1> thirdNodeChild = new ArrayList<>();
		thirdNodeChild.add(fifth);
		thirdNodeChild.add(sixth);

	}

}
