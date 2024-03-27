package org.generic.tree;

import java.util.ArrayList;
import java.util.List;

public class CountLeafNodesDFS {

	public int countNoOfLeaves(TreeNode root) {

		int count = 0;
		List<Integer> list = new ArrayList<>();
		if (root != null) {
			helper(root, list, count);
		}
		return count;
	}

	private void helper(TreeNode node, List<Integer> list, int count) {
		// base case
		if (node == null) {
			return;
		}
		List<TreeNode> childrens = node.children;
		if (childrens == null) {
			count++;
		}
		for (TreeNode child : childrens) {
			helper(child, list, count);
		}
		list.add(node.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
