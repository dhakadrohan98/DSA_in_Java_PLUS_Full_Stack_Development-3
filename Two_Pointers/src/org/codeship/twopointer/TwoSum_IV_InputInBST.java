package org.codeship.twopointer;

import java.util.HashSet;
import java.util.Set;

public class TwoSum_IV_InputInBST {

	private class TreeNode {	
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

	public boolean findTarget(TreeNode root, int k) {
		Set<Integer> set = new HashSet<>();
		return preorder(root, set, k);
	}

	public boolean preorder(TreeNode root, Set<Integer> set, int k) {
		if (root == null) {
			return false;
		}
		int counterEl = k - root.val;
		if (set.contains(counterEl)) {
			return true;
		}
		set.add(root.val);
		return preorder(root.left, set, k) || preorder(root.right, set, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
