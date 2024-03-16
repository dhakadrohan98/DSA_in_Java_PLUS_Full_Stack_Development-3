package org.codebix;

public class Main {

	public static void main(String[] args) {
		
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node head = first; //head -> first -> null;
		
		first.next = second; //head -> first-> second -> null;
		second.next = third; //head -> first-> second-> third -> null;
		
		Node method = null;
		Node last = method.addLast(head, 4);
		head = method.add(head, 3, 5);
	}

}
