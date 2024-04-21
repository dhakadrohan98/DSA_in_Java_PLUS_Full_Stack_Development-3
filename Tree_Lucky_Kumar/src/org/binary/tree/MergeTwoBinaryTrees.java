package org.binary.tree;

public class MergeTwoBinaryTrees {

	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		// if t1 == NULL -> t2
		// if t2 == NULL -> t1
		// sum(t1.val, t2.val);

		// preorder (root -> left-> right)
		if (root1 == null)
			return root2;
		if (root2 == null)
			return root1;
		root1.val = root1.val + root2.val;
		root1.left = mergeTrees(root1.left, root2.left);
		root1.right = mergeTrees(root1.right, root2.right);
		return root1;
	}
}
