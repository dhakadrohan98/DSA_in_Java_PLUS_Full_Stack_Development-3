package com.kumar.binarytree;

public class TreeTraversalMethodsCalling {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode();
		tn.createBinaryTree();
		System.out.print("Iterative PreOrder traversal: ");
		tn.itrPreorder(tn.getRoot());
		System.out.println();
		System.out.print("Iterative Inorder traversal: ");
		tn.itrInorder(tn.getRoot());
		System.out.println();
		System.out.print("Iterative Postorder traversal: ");
		tn.itrPostOrder(tn.getRoot());

	}

}
