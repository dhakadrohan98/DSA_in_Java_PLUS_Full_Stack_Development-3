package org.binary.tree;

public class MinimumDistanceBetweenTwoNodes {

	public static Node lowestCommonAncestor(Node root, int pVal, int qVal) {
		// base case
		if (root == null || root.data == pVal || root.data == qVal) {
			return root;
		}
		Node left = lowestCommonAncestor(root.left, pVal, qVal);
		Node right = lowestCommonAncestor(root.right, pVal, qVal);

		// result
		if (left == null) {
			return right; // if right is also null it doesn't matter
		} else if (right == null) {
			return left; // if left is also null it doesn't matter
		} else { // both left & right are not null, it means both are under current node
			return root;
		}
	}

	public static int solve(Node root, int val) {
		// Two base cases
		if (root == null)
			return 0;
		if (root.data == val)
			return 1;
		// recursive calls
		int a = solve(root.left, val);
		int b = solve(root.right, val);
		if (a == 0 && b == 0)
			return 0;
		else
			return a + b + 1;
	}

	public static int findDist(Node root, int a, int b) {
		// To find LCA p & q's node val is being sent instead of node itself
		Node LCA = lowestCommonAncestor(root, a, b);
		// call for node a
		int x = solve(LCA, a);
		// call for node b
		int y = solve(LCA, b);
		return Math.abs((x + y) - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
