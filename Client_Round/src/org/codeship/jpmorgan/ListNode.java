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
		ListNode firstNode = new ListNode(value);
		firstNode.setNext(head);
		head = firstNode;
		return head;
	}
	
	//Insert node at the last of LL
	public static ListNode insertAtLast(ListNode tail, int value) {
		ListNode lastNode = new ListNode(value);
		tail.setNext(lastNode);
		tail = lastNode;
		return tail;
	}
	
	//Insert node at a given position
	public static ListNode insertAtGivenPosition(int value,int position, ListNode head) {
		int size = size(head);
		int index = 1;
		if(position > size) {
			System.out.println("Invalid position");
			return head;
		}
		else if(position == 1) {
			ListNode firstNode = new ListNode(value);
			firstNode.setNext(head);
			head = firstNode;
			return head;
		}
		else {
			ListNode prev = head;
			while(index < position-1) {
				System.out.println("index: "+ index); //can be commented
				index++;
				prev = prev.next;
			}
			//create a new node
			ListNode newNode = new ListNode(value);
			
			ListNode curr = prev.next;
			newNode.next = curr;
			prev.next = newNode;
			return head;
		}
	}
	
}
