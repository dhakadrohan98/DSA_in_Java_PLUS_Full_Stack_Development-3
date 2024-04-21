package org.generic.tree;

import java.util.*;

public class PostOrderTraversal {

	 public List<Integer> postorder(TreeNode1 root) {
	        
	        List<Integer> ans = new ArrayList<>();
	        if(root != null) {
	            helper(root, ans);
	        }
	        return ans;
	    }
	    
	    private void helper(TreeNode1 root, List<Integer> ans) {
	        //base case
	        if(root == null) {
	            return;
	        }
	        List<TreeNode1> childrens = root.children;
	        for(TreeNode1 child: childrens) {
	            helper(child, ans);
	        }
	        ans.add(root.data);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
