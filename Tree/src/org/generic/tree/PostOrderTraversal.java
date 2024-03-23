package org.generic.tree;

import java.util.*;

public class PostOrderTraversal {

	 public List<Integer> postorder(TreeNode root) {
	        
	        List<Integer> list = new ArrayList<>();
	        if(root != null) {
	            helper(root, list);
	        }
	        return list;
	    }
	    
	    private void helper(TreeNode node, List<Integer> list) {
	        //base case
	        if(node == null) {
	            return;
	        }
	        List<TreeNode> childrens = node.children;
	        for(TreeNode child: childrens) {
	            helper(child, list);
	        }
	        list.add(node.data);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
