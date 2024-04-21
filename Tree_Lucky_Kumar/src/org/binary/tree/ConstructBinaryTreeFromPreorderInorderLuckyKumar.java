package org.binary.tree;

public class ConstructBinaryTreeFromPreorderInorderLuckyKumar {
	static int i = 0;
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		TreeNode root = construct(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
		return root;
	}

	private static TreeNode construct(int[] preorder, int[] inorder, int pre_s, int pre_e, int in_s, int in_e) {
		// base case
		if (pre_s > pre_e && in_s > in_e) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[pre_s]);
		int idx = findIndex(inorder, preorder[pre_s]);
		int len = idx - in_s;
		System.out.println(len);
         System.out.println("i: " + i++);
         System.out.println("in_s: " + in_s + "len -1"
         		+ ": " + (len-1));
		root.left = construct(preorder, inorder, pre_s + 1, pre_s + len, in_s, len - 1);
		root.right = construct(preorder, inorder, pre_s + len + 1, pre_e, idx + 1, in_e);

		return root;
	}

	private static int findIndex(int[] in, int x) {
		for (int i = 0; i < in.length; i++) {
			if (in[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
