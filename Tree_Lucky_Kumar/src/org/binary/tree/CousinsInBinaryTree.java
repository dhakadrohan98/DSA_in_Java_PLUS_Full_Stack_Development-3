package org.binary.tree;

import java.util.*;

public class CousinsInBinaryTree {
	public boolean isCousins(TreeNode root, int x, int y) {
		// edge case
		if (root == null)
			return false;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			boolean isXexist = false;
			boolean isYexist = false;
			// iterating through level of tree
			for (int i = 0; i < size; i++) {
				TreeNode curr = queue.poll();
				if (curr.val == x)
					isXexist = true;
				if (curr.val == y)
					isYexist = true;
				// if x & y having same parent
				if (curr.left != null && curr.right != null) {
					if (curr.left.val == x && curr.right.val == y) {
						return false;
					}
					if (curr.left.val == y && curr.right.val == x) {
						return false;
					}
				}

				if (curr.left != null) {
					queue.offer(curr.left);
				}
				if (curr.right != null) {
					queue.offer(curr.right);
				}
			}
			if (isXexist && isYexist)
				return true;
		}
		return false;

	}
}
