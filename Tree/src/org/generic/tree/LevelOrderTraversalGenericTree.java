package org.generic.tree;

import java.util.*;

public class LevelOrderTraversalGenericTree {

	public static void levelOrder(TreeNode root) {
		if (root == null) return;
		Queue<TreeNode> q = new LinkedList();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode temp = q.poll();
				System.out.print(temp.data + " ");
				for (int j = 0; j < temp.children.size(); j++)
					q.add(temp.children.get(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
