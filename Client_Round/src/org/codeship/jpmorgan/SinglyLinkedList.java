package org.codeship.jpmorgan;

public class SinglyLinkedList {

	
	public static void main(String[] args) {
		ListNode head = null;
		ListNode tail = null;
		ListNode methodInvoke = null;
		ListNode first = new ListNode(2); // 2 --> null
		ListNode second = new ListNode(4);// 4 --> null
		ListNode third = new ListNode(5);// 6 --> null
		ListNode fourth = new ListNode(9);// 9 --> null
		
		head = first; // head --> 2;
		first.setNext(second); // 2 --> 4;
		second.setNext(third);// 2 --> 4 --> 5;
		third.setNext(fourth);// 2 --> 4 --> 5 --> 9 --> null;
		
		System.out.print("Linked List: ");
		ListNode.display(head);
		tail = ListNode.setTail(head, tail);
		System.out.println("Tail Node of SLL: " + tail.getData());
		System.out.println("Size of SLL: "+ListNode.size(head));
		
		//insert |15|null| node at the beginning
		head = ListNode.insertAtBeginning(head,15);
		System.out.print("Newly created Linked List: ");
		ListNode.display(head);
		System.out.println("Size of SLL: "+ListNode.size(head));
		System.out.println("Tail Node of SLL: " + tail.getData());

	}

}
