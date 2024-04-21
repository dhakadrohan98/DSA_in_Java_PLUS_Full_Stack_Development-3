package org.generic.tree;

import java.util.*;

public class ZigZagTraversalBinaryTree {

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		// base case
		if (root == null) {
			return ans;
		}

		Queue<TreeNode> queueNodes = new LinkedList<>();
		queueNodes.offer(root);
		boolean leftToRight = true;

		while (!queueNodes.isEmpty()) {
			int size = queueNodes.size();
			List<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode curr = queueNodes.poll();
//				System.out.println(curr.val);

				temp.add(curr.val);

				if (curr.left != null) {
					queueNodes.offer(curr.left);
				}
				if (curr.right != null) {
					queueNodes.offer(curr.right);
				}
			}
			// after this level
			if (!leftToRight) {
				Collections.reverse(temp);
			}
			leftToRight = !leftToRight;
			ans.add(temp);
		}
		return ans;

	}

	public static void main(String[] args) {
		TreeNode first = new TreeNode(3);
		TreeNode second = new TreeNode(9);
		TreeNode third = new TreeNode(20);
		TreeNode fourth = new TreeNode(15);
		TreeNode fifth = new TreeNode(17);

		first.left = second;
		first.right = third;
		third.left = fourth;
		third.right = fifth;

		List<List<Integer>> zigzagLevelOrder = zigzagLevelOrder(first);
		for (List<Integer> list : zigzagLevelOrder) {
			for (Integer temp : list) {
				System.out.print(temp + " ");
			}
			System.out.println();
		}

	}

}
