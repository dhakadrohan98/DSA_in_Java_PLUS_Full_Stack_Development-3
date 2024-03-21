package org.codebix;

public class PalindromLinkedList {

    // TC: O(n)
    // SC: O(1)
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null) {
            
            if(fast.next.next == null) {
                fast = fast.next.next;
            }
            else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;
    }
    
   public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode ahead = null;
        
        while(curr != null) {
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        head = prev;
        
        return head;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode midNode = middleNode(head);       
        ListNode secondHalfNode = reverseList(midNode.next);
        ListNode temp = head;
        
        
        while(temp != null && secondHalfNode != null) {
            
            if(temp.val != secondHalfNode.val) {
                    return false;
            }
            temp = temp.next;
            secondHalfNode = secondHalfNode.next;
        }
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
