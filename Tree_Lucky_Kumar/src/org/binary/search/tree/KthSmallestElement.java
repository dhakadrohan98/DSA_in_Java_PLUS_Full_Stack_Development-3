package org.binary.search.tree;

import java.util.*;

//Optimised solution
public class KthSmallestElement {
	// TC: O(N)
	// SC: O(1)
	int count = 0;

	public int kthSmallest(TreeNode root, int k) {
		List<Integer> list = new ArrayList<>();
		dfs(root, list, k);
		return list.get(0);
	}

	private void dfs(TreeNode root, List<Integer> list, int k) {
		// two base case
		if (root == null)
			return;

		dfs(root.left, list, k);
		count++; // cnt = 1
		if (k == count) {
			list.add(root.val);
		}
		dfs(root.right, list, k);
	}
}

////TC: O(N)
//	// SC: O(N)stack space + O(N)ArrayList
//	public int kthSmallest(TreeNode root, int k) {
//		List<Integer> list = new ArrayList<>();
//		dfs(root, list);
//		int smallest = list.get(k - 1);
//		return smallest;
//	}
//
//	// inorder traversal to store elements in sorted fashion
//	private void dfs(TreeNode root, List<Integer> list) {
//		if (root == null)
//			return;
//
//		dfs(root.left, list);
//		list.add(root.val);
//		dfs(root.right, list);
//
//	}
