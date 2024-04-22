package org.binary.search.tree;

public class LowestCommonAncestor {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode temp = root;
		int min = Math.min(p.val, q.val);
		int max = Math.max(p.val, q.val);

		while (temp != null) {
			if (temp.val < min) {
				temp = temp.right;
			} else if (temp.val > max) {
				temp = temp.left;
			} else {
				return temp;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
