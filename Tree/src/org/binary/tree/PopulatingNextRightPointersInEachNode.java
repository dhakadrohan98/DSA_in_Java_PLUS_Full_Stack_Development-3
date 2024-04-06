package org.binary.tree;

public class PopulatingNextRightPointersInEachNode {

	 //solve this problem like a matrix
    public Node connect(Node root) {
        //base case
        if(root == null || (root.left == null || root.right == null)) {
            return root;
        }
        Node curr = root;
        while(curr != null) {
            Node temp = curr;
            
            while(temp != null) {
                if(temp.left != null) {
                    temp.left.next = temp.right;                    
                }
                //will work from level 2
                if(temp.next != null && temp.right != null) {
                    temp.right.next = temp.next.left;
                }
                //move temp one step ahead like a column variable at the same level.
                temp = temp.next;
            }
            //move curr one step ahead like a row variable to change the level.
            curr = curr.left;
        }
        return root;
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
