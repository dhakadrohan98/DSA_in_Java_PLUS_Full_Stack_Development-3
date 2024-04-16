package org.binary.search.tree;

public class SearchInBST {

	public TreeNode searchBST(TreeNode root, int val) {

		if (root == null || root.val == val)
			return root;
		else if (root.val > val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
	}
}
