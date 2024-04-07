package org.binary.tree;

import java.util.*;

public class ConstructBinaryTreefromPreorderandInorderTraversalStriver {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		Map<Integer, Integer> inMap = new HashMap<>();
		// inorder[i] -> i
		for (int i = 0; i < inorder.length; i++) {
			inMap.put(inorder[i], i);
		}

		TreeNode root = construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
		return root;
	}

	private static TreeNode construct(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
			Map<Integer, Integer> inMap) {
		
		//base case
		if (preStart > preEnd && inStart > inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[preStart]);
		int inRoot = inMap.get(root.val);
		int numsLeft = inRoot - inStart;
		root.left = construct(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap);
		root.right = construct(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
