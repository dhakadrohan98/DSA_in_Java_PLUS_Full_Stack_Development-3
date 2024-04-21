package org.binary.tree;

import java.util.*;

//Through BFS approach
public class BottomLeftTreeValueBFS {
	//TC: O(n)
	//SC = auxiliary space: O(n)
	public int findBottomLeftValue(TreeNode root) {
		// base case
		if (root == null) {
			return -1;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		TreeNode node = null;
		int ans = -1;

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				node = queue.poll();
				if (node.right != null)
					queue.offer(node.right);
				if (node.left != null)
					queue.offer(node.left);
			}
		}
		ans = node.val;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
