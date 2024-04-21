package org.generic.tree;

public class CreateTreePratham {

	public static void main(String[] args) {
		TreeNodes<Integer> root = new TreeNodes<Integer>(4);
        TreeNodes<Integer> node1 = new TreeNodes<Integer>(2);
        TreeNodes<Integer> node2 = new TreeNodes<Integer>(3);
        TreeNodes<Integer> node3 = new TreeNodes<Integer>(5);
        TreeNodes<Integer> node4 = new TreeNodes<Integer>(6);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);

	}

}
