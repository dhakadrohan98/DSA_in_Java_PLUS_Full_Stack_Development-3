package org.generic.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	
	int data;
	List<TreeNode> children;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public TreeNode(int data, List<TreeNode> children) {
		super();
		this.data = data;
		this.children = children;
	}
}
