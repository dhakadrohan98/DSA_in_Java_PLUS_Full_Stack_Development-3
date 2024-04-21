package org.binary.tree;

import java.util.*;

public class RightSideViewBT {
    //Through DFS preorder in modified way Data->right->left
    //TC: O(N)
    //SC: O(H)
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        int currLevel = 0;
        rightView(root, ans, currLevel);
        return ans;
    }
    
    private void rightView(TreeNode root, List<Integer> ans, int currLevel) {
        //Two base cases
       if(root == null) {
           return;
       }
        
        if(currLevel == ans.size()) {
            ans.add(root.val);
        }
        rightView(root.right, ans, currLevel+1);
        rightView(root.left, ans, currLevel+1);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// (75/216 test cases passed's codes.)
//	public List<Integer> rightSideView(TreeNode root) {
//		List<Integer> ans = new ArrayList<>();
//		// edge case
//		if (root == null) {
//			return ans;
//		}
//
//		ans.add(root.val);
//		
//		if(root.left != null && root.right == null) {
//			if(root.left.left == null && root.left.right == null) {
//				ans.add(root.left.val);
//			}
//		}
//		if (root.right != null) {
//			helper(root.right, ans);
//		}
//		return ans;
//	}
//
//	private void helper(TreeNode root, List<Integer> ans) {
//		// adding curr node value into the ans var
//		ans.add(root.val);
//		// base case
//		if (root == null) {
//			return;
//		}
//
//		if (root.right != null) {
//			helper(root.right, ans);
//		}
//		if (root.left != null) {
//			helper(root.left, ans);
//		}
//	}

}
