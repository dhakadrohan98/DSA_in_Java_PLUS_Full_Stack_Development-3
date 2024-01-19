package org.codeship.jpmorgan;

public class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public static ListNode setTail(ListNode head, ListNode tail) {
		ListNode curr = head;
		
		while(curr.getNext() != null) {
			curr = curr.getNext();
		}
		tail = curr;
		return tail;
	}
	
	public static void display(ListNode head) {
		ListNode curr = head;
		while(curr != null) {
			System.out.print(curr.getData()+" --> ");
			curr = curr.getNext();
		}
		System.out.print("null");
		System.out.println();
	}
	
	public static int size(ListNode head) {
		ListNode curr = head;
		int size = 0;
		
		while(curr != null) {
			size++;
			curr = curr.getNext();
		}
		return size;
	}
	
	//Insert node at the beginning and return head of this newly Linked List
	public static ListNode insertAtBeginning(ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		newNode.setNext(head);
		head = newNode;
		return head;
	}
	
}
