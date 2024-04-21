package org.binary.tree;

import java.util.ArrayList;
import java.util.List;

public class LeftSideViewOfBinaryTree {

	    //Through DFS (preOrder) Data->left->right
	    //TC: O(N)
	    //SC: O(H)
		public List<Integer> leftSideView(TreeNode root) {
	        List<Integer> ans = new ArrayList<>();
	        int currLevel = 0;
	        leftView(root, ans, currLevel);
	        return ans;
	    }
	    
	    private void leftView(TreeNode root, List<Integer> ans, int currLevel) {
	        //Two base cases
	       if(root == null) {
	           return;
	       }
	        
	        if(currLevel == ans.size()) {
	            ans.add(root.val);
	        }
	        leftView(root.left, ans, currLevel+1);
	        leftView(root.right, ans, currLevel+1);
	        
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
