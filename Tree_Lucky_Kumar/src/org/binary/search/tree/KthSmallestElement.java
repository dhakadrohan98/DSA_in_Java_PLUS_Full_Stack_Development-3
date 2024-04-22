package org.binary.search.tree;

import java.util.*;

public class KthSmallestElement {
	//TC: O(N)
	//SC: O(N)stack space + O(N)ArrayList
	public int kthSmallest(TreeNode root, int k) {
		List<Integer> list = new ArrayList<>();
		dfs(root, list);
		int smallest = list.get(k-1);
		return smallest;
	}

	//inorder traversal to store elements in sorted fashion
	private void dfs(TreeNode root, List<Integer> list) {
		if(root == null) return;
		
		dfs(root.left, list);
		list.add(root.val);
		dfs(root.right, list);
		
	}
}
