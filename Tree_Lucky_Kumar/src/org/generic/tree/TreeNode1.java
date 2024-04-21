package org.generic.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode1 {
	
	int data;
	List<TreeNode1> children;
	
	public TreeNode1(int data) {
		this.data = data;
	}
	
	public TreeNode1(int data, List<TreeNode1> children) {
		super();
		this.data = data;
		this.children = children;
	}
}
