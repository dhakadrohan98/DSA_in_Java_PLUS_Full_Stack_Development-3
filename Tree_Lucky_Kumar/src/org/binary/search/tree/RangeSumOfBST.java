package org.binary.search.tree;

public class RangeSumOfBST {
	//TC: < O(N) in average cases & O(N) in worst cases
	//SC: < O(N) in average cases & O(N) in worst cases
	int sum = 0;

	public int rangeSumBST(TreeNode root, int low, int high) {
		dfs(root, low, high);
		return sum;
	}

	public void dfs(TreeNode root, int low, int high) {
		// base case
		if (root == null)
			return;

		if (low <= root.val && root.val <= high) {
			sum += root.val;
		}
		
		 // Corrected order of recursive calls
	    if (root.val > low) {
	        dfs(root.left, low, high);
	    }
	    if (root.val < high) {
	        dfs(root.right, low, high);
	    }
	}
}

//TC: O(N)
//SC: O(N) stack space
//int sum = 0;
//
//public int rangeSumBST(TreeNode root, int low, int high) {
//	dfs(root, low, high);
//	return sum;
//}
//
//public void dfs(TreeNode root, int low, int high) {
//	// base case
//	if (root == null)
//		return;
//
//	if (low <= root.val && root.val <= high) {
//		sum += root.val;
//	}
//	dfs(root.left, low, high);
//	dfs(root.right, low, high);
//}
