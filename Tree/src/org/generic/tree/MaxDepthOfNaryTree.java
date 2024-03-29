package org.generic.tree;

import java.util.*;

public class MaxDepthOfNaryTree {
	//global variable
    int depth = 0;
    
    public int maxDepth(Node root) {
        //Edge case
        if(root == null) {
            return 0;
        }
        int level = 1;
        //calling recursion function for very first time
        helper(root, level);
        return depth;
    }
    //Recursive function
    private void helper(Node root, int level) {
        //base case
        if(root == null) {
            return;
        }
		if (root.children.size() == 0) { // it is a leaf node
			depth = Math.max(depth, level);
		} 
        
        List<Node> children = root.children;
        //Traverse through children of current node & then again call helper function on these childrens
        for(int i = 0; i < children.size(); i++) {
            helper(children.get(i), level + 1);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
