package org.binary.tree;

import java.util.ArrayList;
import java.util.List;

public class PrintPathFromRootToGivenNode {
    //TC: O(n)
    //SC: O(h)
	//Inorder traversal
	private static boolean getPath(TreeNode root, List<Integer> ds, int x) {
		// base case
		// if root is NULL
		// there is no path
		if (root == null) {
			return false;
		}
		// push the node's value in 'ds'
		ds.add(root.val);

		// if it is the required node
		// return true
		if (root.val == x) {
			return true;
		}

		// else check whether the required node lies
		// in the left subtree or right subtree of
		// the current node
		if (getPath(root.left, ds, x) || getPath(root.right, ds, x)) {
			return true;
		}
		// Thus, remove current node's value from
        // 'ds'and then return false 
		ds.remove(Integer.valueOf(root.val));
		return false;

	}

	public static List<Integer> solve(TreeNode root, int x) {
		List<Integer> ds = new ArrayList<>();
		// edge case
		if (root == null) {
			return ds;
		}
		getPath(root, ds, x);
		return ds;
	}

	public static void main(String args[]) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(6);
		root.left.right.right = new TreeNode(7);
		root.right = new TreeNode(3);

		ArrayList<Integer> arr = new ArrayList<>();

		boolean res;
		List<Integer> ans = solve(root, 7);

		System.out.print("The path is ");
		for (int it : ans) {
			System.out.print(it + " ");
		}
	}

}
