package com.kumar.binarytree;

import java.util.Stack;

public class TreeNode {
	
	private TreeNode left;
	private TreeNode right;
	private int data;
	
	private TreeNode root;
	
	//Get root node
	public TreeNode getRoot() {
		return this.root;
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
	
	//PreOrder (Boundary level) Traversal (DLR)
	public void recPreorder(TreeNode root) {
		// Base case to break recursive call
		if(root == null) {
			return;
		}
		System.out.print(root.data + ", ");
		recPreorder(root.left);
		recPreorder(root.right);

	}
	
	//Iterative PreOrder(Boundary level) traversal (DLR)
	public void itrPreorder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + ", ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
	    }
	}
	
	//Recursive InOrder traversal (LDR)
	public void recInorder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		recInorder(root.left);
		System.out.print(root.data + ", ");
		recInorder(root.right);
	}
	
	//Iterative InOrder traversal of BT (LDR)
	public void itrInorder(TreeNode root) {
		if(root == null) {
			return; 
		}
		
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		
		while(!stack.isEmpty() || temp!=null) {
			
			if(temp!=null) {
				stack.push(temp);
				temp = temp.left;
			}
			else {
				temp = stack.pop();
				System.out.print(temp.data + ", ");
				temp = temp.right;
			}
		}
	}
}
