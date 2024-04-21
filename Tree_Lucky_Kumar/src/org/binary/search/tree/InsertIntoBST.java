package org.binary.search.tree;

public class InsertIntoBST {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null) {
			// Create a new node and return it
			TreeNode temp = new TreeNode(val);
			return temp;
		}

		if (val < root.val) {
			// Recurse on the left subtree
			root.left = insertIntoBST(root.left, val);
		} else if (val > root.val) {
			// Recurse on the right subtree
			root.right = insertIntoBST(root.right, val);
		}
		// If val is equal to root.val, no change needed (BST doesn't allow duplicates)

		return root; // Return the modified root
	}
}
