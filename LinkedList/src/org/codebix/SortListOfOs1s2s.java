package org.codebix;

public class SortListOfOs1s2s {

	public static Node segregate(Node head) {
		//base case
		if(head == null || head.next == null) {
			return head;
		}
		
		Node zeroHead = new Node(-1);
		Node zeroP = zeroHead;
		Node oneHead = new Node(-1);
		Node oneP = oneHead;
		Node twoHead = new Node(-1);
		Node twoP = twoHead;
		Node temp = head;
		
		while(temp != null) {
			
			if(temp.data == 0) {
				zeroP.next = temp;
				zeroP = zeroP.next;
			}
			else if(temp.data == 1) {
				oneP.next = temp;
				oneP = oneP.next;
			}
			else {
				twoP.next = temp;
				twoP = twoP.next;
			}
			temp = temp.next;
		}
		
		//changing link of zeroHead, oneHead & twoHead.
		zeroP.next = (oneHead.next != null)? oneHead.next : twoHead.next;
		oneP.next = twoHead.next;
		twoP.next = null;
		
		Node newHead = zeroHead.next;
		return newHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
