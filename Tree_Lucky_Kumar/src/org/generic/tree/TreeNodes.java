package org.generic.tree;

import java.util.*;

public class TreeNodes<T> {
	public T data;
	public ArrayList<TreeNodes<T>> children;

	public TreeNodes(T data) {
		this.data = data;
		children = new ArrayList<>();
	}
}
