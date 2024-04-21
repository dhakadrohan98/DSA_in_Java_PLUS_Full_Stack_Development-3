package org.binary.tree;

public class DiamaterOfBinaryTree {
	//TC: O (n)
	//SC = stack space : O(depth of the tree)
	 public int diameterOfBinaryTree(TreeNode root) {
	        int[] maxi = new int[1]; 
	       findMax(root, maxi);
	        return maxi[0]; 
	    }

	    private int findMax(TreeNode root, int[] maxi) {
	        //base case
	        if(root == null) {
	            return 0;
	        }
	        //recursive call
	        int lh = findMax(root.left, maxi);
	        int rh = findMax(root.right, maxi);
	        
	        maxi[0] = Math.max(maxi[0], lh + rh);
	        return 1 + Math.max(lh,rh);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
