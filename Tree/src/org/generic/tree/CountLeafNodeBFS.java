package org.generic.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CountLeafNodeBFS {

	static int count = 0;

	public static int countLeafBfs(TreeNode root) {
		//Through BFS (level order traversal)
		if (root == null)
			return count;
		Queue<TreeNode> q = new LinkedList();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode temp = q.poll();
				List<TreeNode> childs = temp.children;

				if (childs.size() == 0) {
					count++;
				}
				for (int j = 0; j < temp.children.size(); j++)
					q.add(temp.children.get(j));
			}
			System.out.println();
		}

		return count;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(100);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node1.children.add(node4);
		node1.children.add(node5);
		int ans = countLeafBfs(root);
		System.out.println(ans);

	}

}
