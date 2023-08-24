package com.kumar.binarytree;

public class TreeTraversalMethods {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode();
		tn.createBinaryTree();
		System.out.print("PreOrder traversal: ");
		tn.itrPreorder(tn.getRoot());
		System.out.println();
		System.out.print("Inorder traversal: ");
		tn.recInorder(tn.getRoot());

	}

}
