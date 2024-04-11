package org.binary.tree;

public class PathSum {

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
			
		// check whether root's val == sum or not and coming root is leaf node or not
		if (root.val == sum && (root.left == null && root.right == null))
			return true;
		return hasPathSum(root.left, sum - root.val) || //
				hasPathSum(root.right, sum - root.val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
