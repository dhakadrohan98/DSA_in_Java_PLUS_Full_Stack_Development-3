package org.generic.tree;

import java.util.*;

public class CreateTree {

	public static void main(String[] args) {
		TreeNode first = new TreeNode(4);
		TreeNode second = new TreeNode(5);
		TreeNode third = new TreeNode(6);
		TreeNode fourth = new TreeNode(1);
		TreeNode fifth = new TreeNode(2);
		TreeNode sixth = new TreeNode(3);
		
		List<TreeNode> firstNodeChild = new ArrayList<>();
		firstNodeChild.add(second);
		firstNodeChild.add(third);
		firstNodeChild.add(fourth);
		
		List<TreeNode> thirdNodeChild = new ArrayList<>();
		thirdNodeChild.add(fifth);
		thirdNodeChild.add(sixth);

	}

}
