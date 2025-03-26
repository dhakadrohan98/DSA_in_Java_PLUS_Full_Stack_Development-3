package org.twopointer.revision;

import java.util.*;

// Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class TwoSum_IV_InputInBST {

	// TC: O(n) tree traverse
	// SC: O(n) storing elements in set
	public boolean findTarget(TreeNode root, int k) {
		Set<Integer> set = new HashSet<>();
		return preOrder(root, k, set);
	}

	private boolean preOrder(TreeNode root, int k, Set<Integer> set) {
		// base case
		if (root == null)
			return false;
		int remaining = k - root.val;
		if (set.contains(remaining)) {
			return true;
		}
		set.add(root.val);
		boolean leftSubtree = preOrder(root.left, k, set);
		boolean rightSubtree = preOrder(root.right, k, set);
		return leftSubtree || rightSubtree;
	}
}
