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
		tn.createBTforBLT(); //Creating binary tree for Boundary level traversal
		System.out.print("Boundary Level traversal: ");
		System.out.println(tn.printBoundary(tn.getRoot()));
		
		System.out.println();
		tn.createBTforBLT();
		System.out.print("ZigZag level order traversal : ");
		System.out.println(tn.zigzagOrderTraversal(tn.getRoot()));
		
		System.out.println();
		System.out.print("Top view of Binary Tree: ");
		System.out.println(tn.topView(tn.getRoot()));

		System.out.println();
		System.out.print("Bottom view of Binary Tree: ");
		System.out.println(tn.bottomView(tn.getRoot()));
		
		System.out.println();
		System.out.print("Right view of Binary Tree: ");
		System.out.println(tn.rightSideView(tn.getRoot()));
		
		System.out.println();
		System.out.print("Left view of Binary Tree: ");
		System.out.println(tn.leftSideView(tn.getRoot()));
		
//		System.out.println();
//		System.out.print("Lowest Common Ancestor of Binary Tree: ");
//		System.out.println(tn.lowestCommonAncestor(tn.getRoot(),p,q));
		
		tn.createBTForHeight();
		System.out.println();
		System.out.print("Max Height/Depth of Binary Tree: ");
		System.out.println(tn.maxDepth(tn.getRoot()));
		
		System.out.println();
		System.out.print("Diameter of Binary Tree: ");
		System.out.println(tn.diameterOfBinaryTree(tn.getRoot()));
        
		System.out.println();
		tn.createSumTree();
		System.out.println("Check if a binary tree is a sum tree or not: ");
		if(tn.isSumTree(tn.getRoot()) != Integer.MIN_VALUE) {
			System.out.println(tn.isSumTree(tn.getRoot()));
			System.out.println("Given tree is sum tree");
		}
		else {
			System.out.println(tn.isSumTree(tn.getRoot()));
			System.out.println("Given tree is not sum tree");
		}
		
		System.out.println();
		System.out.print("Balanced Binary Tree: ");
		System.out.println(tn.isBalanced(tn.getRoot()));
		
		System.out.println();
		System.out.print("Minimum element in BST: ");
		System.out.println(tn.minValue(tn.getRoot()));
	}

}
