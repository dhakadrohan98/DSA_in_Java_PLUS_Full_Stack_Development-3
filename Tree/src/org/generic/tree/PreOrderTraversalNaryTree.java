package org.generic.tree;

import java.util.*;

public class PreOrderTraversalNaryTree {

    public List<Integer> preorder(TreeNode1 root) {
        
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
        //adding current node into ans List
        ans.add(root.data);
        List<TreeNode1> childrens = root.children;
        for(TreeNode1 child: childrens) {
            helper(child, ans);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
