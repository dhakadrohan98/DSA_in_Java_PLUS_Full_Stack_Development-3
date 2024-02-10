package org.single.ll;

class ListNode {
	
	int data;
	ListNode next;
	
	ListNode(int data) {
		this.data = data;
	}
	
	ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
}
public class ReverseSingleLinkedList {

	public ListNode reverseList(ListNode head) {
        //recursive approach
        if(head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
	
	public static void main(String[] args) {
		

	}

}
