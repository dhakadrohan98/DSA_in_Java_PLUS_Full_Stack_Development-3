package org.generic.tree;

import java.util.List;

public class Node {
	int val;
	List<Node> children;
	
	public Node(int val) {
		this.val = val;
	}
	
	public Node(int val, List<Node> children) {
		super();
		this.val = val;
		this.children = children;
	}
}
