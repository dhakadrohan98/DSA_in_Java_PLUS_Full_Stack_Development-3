package org.binary.tree;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
		super();
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		super();
		this.val = val;
		this.left = left;
		this.right = right;
	}

}
