package org.codebix;

public class SwapNodesInPairs {
	//Recursive solution
	public Node swapPairs(Node head) {
        //base case
        if(head == null || head.next == null) {
            return head;
        }
        
        Node temp = head.next; //temp -> B
        head.next = swapPairs(head.next.next);
        temp.next = head;
        return temp;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
