package org.binary.tree;

import java.util.*;

public class LowestCommonAncestorThroughArrayList {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //base case
        if(root == null || root == p || root == q) {
            return root;
        }
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        
        for(int i=0; i<list1.size(); i++) {
        	TreeNode prev = list1.get(i);
        	if(list1.get(i) != list2.get(i)) {
        		return prev;
        	}
        	
        }
        
        return root;
    }
	
	public void getPath(TreeNode root, TreeNode temp, List<TreeNode> list) {
		//base case
		if(root == null)
			return;
		list.add(root);
		
		if(root == temp) {
			return;
		}
		
		getPath(root.left, temp, list);
		getPath(root.right, temp, list);
		list.remove(list.size()-1);
	}
}
