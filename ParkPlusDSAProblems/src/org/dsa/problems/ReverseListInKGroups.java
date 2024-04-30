package org.dsa.problems;

public class ReverseListInKGroups {
	private ListNode reverseList(ListNode head) {
		// base case
		if (head == null) {
			return head;
		}

		ListNode curr = head;
		ListNode prev = null;
		ListNode nextt = null;

		while (curr != null) {
			nextt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextt;
		}
		return prev;
	}

	private ListNode getKthNode(ListNode temp, int k) {
		k -= 1;
		while (temp != null && k > 0) {
			temp = temp.next;
			k -= 1;
		}
		return temp;
	}

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode temp = head;
		ListNode prevNode = null;

		while (temp != null) {
			ListNode kthNode = getKthNode(temp, k);
			// base case
			if (kthNode == null) {
				if (prevNode != null) {
					prevNode.next = temp;
				}
				break;
			}

			ListNode nextNode = kthNode.next;
			kthNode.next = null;
			reverseList(temp);
			if (temp == head) {
				head = kthNode;
			} else {
				prevNode.next = kthNode;
			}
			prevNode = temp;
			temp = nextNode;
		}
		return head;
	}
}
