package org.binary.tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderPostorderTree {

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		Map<Integer, Integer> hmap = new HashMap<>();
		// inorder[i] -> i
		for (int i = 0; i < inorder.length; i++) {
			hmap.put(inorder[i], i);
		}

		TreeNode root = construct(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, hmap);
		return root;
	}

	private static TreeNode construct(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart,
			int postEnd, Map<Integer, Integer> hmap) {

		// base case
		if (postStart > postEnd && inStart > inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(postorder[postEnd]);
		int inRoot = hmap.get(root.val);
		int numsLeft = inRoot - inStart;
		root.left = construct(inorder, inStart, inRoot - 1, postorder, postStart, postStart + numsLeft - 1, hmap);
		root.right = construct(inorder, inRoot + 1, inEnd, postorder, postStart + numsLeft, postEnd - 1, hmap);

		return root;
	}

	public static void main(String[] args) {
		
	}

}
