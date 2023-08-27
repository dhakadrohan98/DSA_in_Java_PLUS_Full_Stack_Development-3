package com.pepcoding.generictree;

import java.util.*;

public class Node {
	public int data;
	ArrayList<Node> children = new ArrayList<>();
	
	public Node(int data) {
		this.data = data;
	}
	
	public void display(Node node) {
		String str = node.data + "->";
		for(Node child: node.children) {
			str += child.data + ", ";
		}
		str += ".";
		System.out.println(str);
		
		for(Node child: node.children) {
			display(child);
		}
	}
}
