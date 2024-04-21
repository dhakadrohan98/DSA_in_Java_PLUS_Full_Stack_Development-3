package org.binary.tree;

import java.util.*;

public class SerialiseDeserialiseBinaryTree {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		// base case
		if (root == null)
			return "";
		Queue<TreeNode> queue = new LinkedList<>();
		StringBuilder res = new StringBuilder();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node == null) {
				res.append("#,");
				continue;
			}
			res.append(node.val + ",");
			queue.add(node.left);
			queue.add(node.right);
		}
		return res.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		// base case
		if (data.equals(""))
			return null;
		Queue<TreeNode> queue = new LinkedList<>();
		String[] values = data.split(",");
		TreeNode root = new TreeNode(Integer.parseInt(values[0]));
		queue.add(root);
		for (int i = 1; i < values.length; i++) {
			TreeNode parent = queue.poll();
			if (!values[i].equals("#")) {
				TreeNode left = new TreeNode(Integer.parseInt(values[i]));
				parent.left = left;
				queue.add(left);
			}
			i++; // for a right child
			if (!values[i].equals("#")) {
				TreeNode right = new TreeNode(Integer.parseInt(values[i]));
				parent.right = right;
				queue.add(right);
			}
		}
		return root;
	}
}
