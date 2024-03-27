package org.generic.tree;

import java.util.ArrayList;
import java.util.List;

public class CountNoOfLeafNodesThroughPostorderTraversal {

	public int postorder(TreeNode1 root) {
        
	 	int count = 0;
        List<Integer> list = new ArrayList<>();
        if(root != null) {
            helper(root, list, count);
        }
        return count;
    }
    
    private void helper(TreeNode1 node, List<Integer> list, int count) {
        //base case
        if(node == null) {
            return;
        }
        List<TreeNode1> childrens = node.children;
        if(childrens == null) {
        	count++;
        }
        for(TreeNode1 child: childrens) {
            helper(child, list, count);
        }
        list.add(node.data);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
