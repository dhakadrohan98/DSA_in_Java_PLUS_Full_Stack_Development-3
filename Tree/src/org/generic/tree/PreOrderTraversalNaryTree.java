package org.generic.tree;

import java.util.*;

public class PreOrderTraversalNaryTree {

    public List<Integer> preorder(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        if(root != null) {
            helper(root, ans);
        }
        return ans;
    }
    
    private void helper(TreeNode root, List<Integer> ans) {
        //base case
        if(root == null) {
            return;
        }
        //adding current node into ans List
        ans.add(root.data);
        List<TreeNode> childrens = root.children;
        for(TreeNode child: childrens) {
            helper(child, ans);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
