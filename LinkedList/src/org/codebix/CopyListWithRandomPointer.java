package org.codebix;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

	public Node copyRandomList(Node head) {
		// base case
		if (head == null) {
			return null;
		}
		// creating HashMap<oldNode, newNode>
		Node temp = head;
		Map<Node, Node> hmap = new HashMap<>();

		while (temp != null) {
			Node newNode = new Node(temp.val);
			hmap.put(temp, newNode);
			temp = temp.next;
		}
		// Assigning next & random pointers
		temp = head;
		while (temp != null) {
			Node old = temp;
			Node newNode = hmap.get(old);

			newNode.next = hmap.get(old.next);
			newNode.random = hmap.get(old.random);
			temp = temp.next;
		}
		return hmap.get(head);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
