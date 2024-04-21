package org.generic.tree;

import java.util.*;

public class GenericTreeZigZagTraversal {

	//TC: O(n)
	//SC: O(n)
	public static List<List<Integer>> zigzagLevelOrder(TreeNode1 root) {
		List<List<Integer>> ans = new ArrayList<>();
		// base case
		if (root == null) {
			return ans;
		}

		Queue<TreeNode1> queueNodes = new LinkedList<>();
		queueNodes.offer(root);
		boolean leftToRight = true;

		while (!queueNodes.isEmpty()) {
			int size = queueNodes.size();
			List<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode1 curr = queueNodes.poll();
				List<TreeNode1> childs = curr.children;
//				System.out.println(curr.val);
				//adding curr node into temp ArrayList
				temp.add(curr.data);
				//adding all childs of curr node into queue ds
				for(int j=0; j<childs.size(); j++) {
					queueNodes.offer(childs.get(j));
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
		// TODO Auto-generated method stub

	}

}
