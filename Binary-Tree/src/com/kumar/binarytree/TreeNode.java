package com.kumar.binarytree;

public class TreeNode {
	
	private TreeNode left;
	private TreeNode right;
	private int data;
	
	private TreeNode root;
	
	public TreeNode() {
		super();
	}
	public TreeNode(int data) {
		this.data = data;
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		root = first;
		first.left = third; //     second<---first--->first
		first.right = second;
		second.left = fifth;//     fourth<---second--->fifth
		second.right = fourth;
		
		//printing nodes
		System.out.println(first.data);
		System.out.println(first.left.data);
		System.out.println(first.right.data);
		System.out.println(second.left.data);
		System.out.println(second.right.data);
	}
}
