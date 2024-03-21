package org.codebix;

public class ConvertBinaryNumberinaLinkedListtoInteger {

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
    
    public int getDecimalValue(ListNode head) {
        ListNode reverseHead = reverseList(head);
        
        ListNode temp = reverseHead;
        int i = 0;
        int ans = 0;
        
        while(temp != null) {
            ans += temp.val * Math.pow(2,i);
            i++;
            temp = temp.next;
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
