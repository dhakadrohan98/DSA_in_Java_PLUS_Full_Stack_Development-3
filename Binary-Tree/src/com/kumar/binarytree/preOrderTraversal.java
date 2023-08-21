package com.kumar.binarytree;

public class preOrderTraversal {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode();
		tn.createBinaryTree();
		tn.preOrder(tn.getRoot());

	}

}
