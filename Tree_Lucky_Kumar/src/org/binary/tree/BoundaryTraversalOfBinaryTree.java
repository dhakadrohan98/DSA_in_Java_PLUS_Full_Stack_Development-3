package org.binary.tree;

import java.util.*;

public class BoundaryTraversalOfBinaryTree {
	public static boolean isLeaf(Node root) {
		return ((root.left == null) && (root.right == null));
	}

	public static void addLeftBoundary(Node root, ArrayList<Integer> res) {
		Node curr = root.left;
		while (curr != null) {
			if (isLeaf(curr) == false) {
				res.add(curr.data);
			}
			if (curr.left != null) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
	}

	public static void addRightBoundary(Node root, ArrayList<Integer> res) {
		Node curr = root.right;
		ArrayList<Integer> tmp = new ArrayList<>();

		while (curr != null) {
			if (isLeaf(curr) == false) {
				tmp.add(curr.data);
			}
			if (curr.right != null) {
				curr = curr.right;
			} else {
				curr = curr.left;
			}
		}
		// reverse the right boundary's nodes
		for (int i = tmp.size() - 1; i >= 0; i--) {
			res.add(tmp.get(i));
		}
	}

	// recursive function
	public static void addLeaves(Node root, ArrayList<Integer> res) {
		if (isLeaf(root)) {
			res.add(root.data);
			return;
		}
		// recursive call
		if (root.left != null) {
			addLeaves(root.left, res);
		}

		if (root.right != null) {
			addLeaves(root.right, res);
		}
	}

	public static ArrayList<Integer> boundary(Node node) {
		ArrayList<Integer> ans = new ArrayList<>();
		if (isLeaf(node) == false) {
			ans.add(node.data);
		}
		addLeftBoundary(node, ans);
		addLeaves(node, ans); //if one node is given then its data will be added through this line in ans ArraYList
		addRightBoundary(node, ans);
		return ans;
	}
}
