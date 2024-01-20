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
		ListNode curr = head;
		
		while(curr.getNext() != null) {
			curr = curr.getNext();
		}
		tail = curr;
		
		System.out.print("Initial Linked List: ");
		ListNode.display(head);
		System.out.println("Tail Node of SLL: " + tail.getData());
		System.out.println("Size of SLL: "+ListNode.size());
		
		//insert |15|null| node at the beginning
		head = ListNode.insertAtBeginning(head,15);
		System.out.print("After inserting 15 at the beginning, newly Linked List: ");
		ListNode.display(head);
		System.out.println("Size of SLL: "+ListNode.size());
		
		//insert |20|null| node at the beginning
		tail = ListNode.insertAtLast(tail, 20);
		System.out.print("After inserting 20 at the last, newly Linked List: ");
		ListNode.display(head);
		System.out.println("Tail Node of SLL: " + tail.getData());
		System.out.println("Size of SLL: "+ListNode.size());
		
		//insert |6|null| at 5th position
		head = ListNode.insertAtGivenPosition(23, 6, head);
		ListNode.display(head);
		System.out.println("Size of SLL: "+ListNode.size());

		//delete first node
		System.out.println("Deleting first node");
		head = ListNode.deleteFirstNode(head);
		ListNode.display(head);
		System.out.println("Size of SLL: "+ListNode.size());
		
		//delete last node
		System.out.println("Deleting last node");
		ListNode last = ListNode.deleteLastNode(head);
		ListNode.display(head);
		System.out.println("Size of SLL: "+ListNode.size());
	}

}
