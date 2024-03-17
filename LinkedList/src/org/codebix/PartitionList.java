package org.codebix;

public class PartitionList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode partition(ListNode head, int x) {
		if (head == null) {
			return head;
		}

		ListNode small = new ListNode(-1);
		ListNode large = new ListNode(-1);
		ListNode smallP = small;
		ListNode largeP = large;
		ListNode temp = head;

		while (temp != null) {
			if (temp.val < x) {
				ListNode smallNode = new ListNode(temp.val);
				smallP.next = smallNode;
				smallP = smallP.next;
			} else {
				ListNode largeNode = new ListNode(temp.val);
				largeP.next = largeNode;
				largeP = largeP.next;
			}
			temp = temp.next;
		}
		// connecting smallP to the large LL next node.
		smallP.next = large.next;
		return small.next;
	}

	public static void main(String[] args) {}

}
