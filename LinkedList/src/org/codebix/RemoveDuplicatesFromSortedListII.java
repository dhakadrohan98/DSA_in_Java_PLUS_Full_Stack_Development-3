package org.codebix;

public class RemoveDuplicatesFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
	       ListNode dummy = new ListNode(-1, head);
	        ListNode prev = dummy;
	        
	        while(head != null) {
	            //if prev & next node values are equal we need to just skip those nodes
	            //and at the last need to connect prev's next with head's next;
	            if(head.next != null && head.val == head.next.val) {
	                while(head.next != null && head.val == head.next.val) {
	                    head = head.next;
	                }
	                prev.next = head.next;
	            }
	            else {
	                prev = prev.next;
	            }
	            head = head.next;
	        }
	        return dummy.next;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
