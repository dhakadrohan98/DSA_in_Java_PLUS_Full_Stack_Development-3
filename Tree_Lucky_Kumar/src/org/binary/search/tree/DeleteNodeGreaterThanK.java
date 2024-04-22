package org.binary.search.tree;

public class DeleteNodeGreaterThanK {
	//Medium level on GFG
	public Node1 deleteNode(Node1 root,int k) {
        //base case
        if(root == null) return root;
        
        if(root.data >= k) {
            root.left = deleteNode(root.left, k);
            return root.left;
        }
        else {
            root.right = deleteNode(root.right, k);
        }
        return root;
    }
}
