package org.binary.search.tree;

import java.util.*;

public class ClosetNeighbourInBST {
	//Recursive approach
	//Solve it in iterative way
	public static int findMaxForN(Node root, int x) {
		List<Integer> list = new ArrayList<>(); //
		list.add(-1);
		helper(root, x, list);
		return list.get(0);
	}

	public static void helper(Node root, int x, List<Integer> list) {
		// base cases
		if (root == null)
			return;

		if (root.key <= x) {
			list.add(0, root.key);
			helper(root.right, x, list);
		}

		else {
			helper(root.left, x, list);
		}
	}
}
