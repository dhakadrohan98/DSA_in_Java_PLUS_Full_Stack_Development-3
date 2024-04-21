package org.binary.tree;

public class PopulatingNextRightPointersInEachNode {

	// 1st way:

	// solve this problem like a matrix or in iterative manner
	public Node connect(Node root) {
		// base case
		if (root == null || (root.left == null || root.right == null)) {
			return root;
		}
		Node curr = root;
		while (curr != null) {
			Node temp = curr;

			while (temp != null) {
				if (temp.left != null) {
					temp.left.next = temp.right;
				}
				// will work from level 2
				if (temp.next != null && temp.right != null) {
					temp.right.next = temp.next.left;
				}
				// move temp one step ahead like a column variable at the same level.
				temp = temp.next;
			}
			// move curr one step ahead like a row variable to change the level.
			curr = curr.left;
		}
		return root;

	}

	// 2nd way:

	// Through DFS
	public Node connect1(Node root) {
		// edge case
		if (root == null || (root.left == null || root.right == null)) {
			return root;
		}
		connectTwoNodes(root.left, root.right);
		return root;
	}

	public void connectTwoNodes(Node p, Node q) {
		if (p == null) {
			return;
		}
		p.next = q;
		connectTwoNodes(p.left, p.right);
		connectTwoNodes(q.left, q.right);
		connectTwoNodes(p.right, q.left);
	}
}
