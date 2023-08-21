package com.kumar.binarytree;

public class TreeNode {
	
	private TreeNode left;
	private TreeNode right;
	private int data;
	
	private TreeNode root;
	
	//Get root node
	public TreeNode getRoot() {
		return root;
	}
	
	public TreeNode() {
		super();
	}
	public TreeNode(int data) {
		this.data = data;
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(4);
		TreeNode fourth = new TreeNode(5);
		TreeNode fifth = new TreeNode(3);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		
		root = first;
		first.left = second; //    second<---first--->fifth
		first.right = fifth;
		second.left = third;//     third<---second--->fourth
		second.right = fourth;
		fifth.left = sixth;//      sixth<--fifth-->seventh
		fifth.right = seventh;
	}
	
	//InOrder (Boundary level) Traversal
	public void preOrder(TreeNode root) {
		// Base case to break recursive call
		if(root == null) {
			return;
		}
		System.out.print(root.data + ", ");
		preOrder(root.left);
		preOrder(root.right);

	}
}
