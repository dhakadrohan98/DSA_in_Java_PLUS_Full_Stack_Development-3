package com.kumar.binarytree;

public class BinarySearchTree {

	   private TreeNode root;

	   private class TreeNode {
	      private int data; // Generic type
	      private TreeNode left;
	      private TreeNode right;

	      //parametrized constructor
	      public TreeNode(int data) {
	         this.data = data;
	      }
	   }
	   
	   ////calling actual insert method from here
	   public void insert(int value) {
		   root = insert(root, value);
	   }
	   
	   //Insert a node in BST(well maintained tree)
	   public TreeNode insert(TreeNode root, int value) {
		   if(root == null) {
			   root = new TreeNode(value);
			   return root;
		   }
		   
		   if(value < root.data) {
			   root.left = insert(root.left, value);
		   }
		   else {
			   root.right = insert(root.right, value);
		   }
		   return root;
	   }
	   
	 //calling actual inOrder method from here
	   public void inOrder() {
		   inOrder(root);
	   }
	   
	   //InOrder traversal in case of Binary search tree means applying sorting.
	   public void inOrder(TreeNode root) {
		   if(root == null) {
			   return;
		   }
		   inOrder(root.left);
		   System.out.print(root.data+ " ");
		   inOrder(root.right);
	   }
	   
	   //calling actual search method from here
	   public TreeNode search(int key) {
		   return search(root, key);
	   }
	   
	   //search a given key in a Binary Search Tree (Recursive)
	   public TreeNode search(TreeNode root, int key) {
		   //Base case to break recursion
		   if(root == null || root.data==key) {
			   return root;
		   }
		   if(key < root.data) {
			   return search(root.left, key);
		   }
		   else {
			   return search(root.right, key);
		   }
	   }

	   public static void main(String[] args) {
	      BinarySearchTree bst = new BinarySearchTree();
	      bst.insert(5);
	      bst.insert(7);
	      bst.insert(1);
	      bst.insert(3);
	      bst.insert(4);

	      System.out.print("Inorder traversal(sorted order): ");
	      bst.inOrder();

	      System.out.println();

	      if (null != bst.search(4)) {
	         System.out.println("Key found!");
	      } else {
	         System.out.println("Key not found!xxxx");
	      }
	   }
}
