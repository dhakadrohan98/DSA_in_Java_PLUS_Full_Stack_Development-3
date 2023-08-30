package com.kumar.binarytree;

public class TreeTraversalMethodsCalling {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode();
//		tn.createBinaryTree();
//		
//		System.out.print("Iterative PreOrder traversal: ");
//		tn.itrPreorder(tn.getRoot());
//		System.out.println();
//		
//		System.out.print("Iterative Inorder traversal: ");
//		tn.itrInorder(tn.getRoot());
//		System.out.println();
//		
//		System.out.print("Iterative Postorder traversal: ");
//		tn.itrPostOrder(tn.getRoot());
//		System.out.println();
//		
//		System.out.print("Level Order Traversal: ");
//		tn.levelOrderTraversal(tn.getRoot());
//		System.out.println();
//		
//		System.out.print("Maximum values among nodes of a given tree: ");
//		System.out.println(tn.findMax(tn.getRoot()));
//		 
//		System.out.print("Symmetric Tree: ");
//		System.out.println(tn.isSymmetric(tn.getRoot()));
		
		tn.createBTForDiagonalElements();
		System.out.print("Diagonal traversal of tree: ");
		tn.printDiagonal(tn.getRoot());
		
		System.out.println();
		tn.createBTforBLT();
		System.out.print("Boundary Level traversal: ");
		System.out.println(tn.printBoundary(tn.getRoot()));
		
		System.out.println();
		tn.createBTforBLT();
		System.out.print("ZigZag level order traversal : ");
		System.out.println(tn.zigzagOrderTraversal(tn.getRoot()));
		
		System.out.println();
		System.out.print("Top view of Binary Tree: ");
		System.out.println(tn.topView(tn.getRoot()));

	}

}
