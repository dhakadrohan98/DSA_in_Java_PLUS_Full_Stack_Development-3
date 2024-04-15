package org.binary.tree;

import java.util.*;

public class PathSumIII {
	int total = 0;

	public int pathSum(TreeNode root, int targetSum) {
		// edge case
		if (root == null)
			return 0;

		Map<Integer, Integer> hm = new HashMap<>();
		hm.put(0, 1);
		findPathSum(root, 0, targetSum, hm);
		return total;
	}

	private void findPathSum(TreeNode curr, int sum, int target, Map<Integer, Integer> hm) {
		// base case
		if (curr == null)
			return;

		sum += curr.val;
		if (hm.containsKey(sum - target)) {
			total += hm.get(sum - target);
		}
		hm.put(sum, hm.getOrDefault(sum, 0) + 1);
		// recursive left & right subtree call
		findPathSum(curr.left, sum, target, hm);
		findPathSum(curr.right, sum, target, hm);
		// reducing value of key from hm while backtracking from bottom of the tree
		hm.put(sum, hm.get(sum) - 1);
		return;
	}

}

//path sum through brute force approach TC: O(n^2)
//int total = 0;
//public int pathSum(TreeNode root, int targetSum) {
//    //edge case
//    if(root == null) return 0;
//    
//    //another methods call
//    findPathSum(root, targetSum, 0);
//    //recursive call on left & right subtree
//    pathSum(root.left, targetSum);
//    pathSum(root.right, targetSum);
//    return total;
//}
//
//public void findPathSum(TreeNode root, int targetSum, int currSum) {
//    //base case
//    if(root == null) return;
//    
//    currSum += root.val;
//    	
//    if(targetSum == currSum)
//        total++;
//    
//    findPathSum(root.left, targetSum, currSum);
//    findPathSum(root.right, targetSum, currSum);
//    
//}
