package org.binary.tree;

public class BinaryTreeTilt {

	//TC: O(N)
	//SC: O(1)
	//Through DFS: postOrder (left->right->data)
    int tilt = 0;
    
    public int findTilt(TreeNode root) {
        helper(root);
        return tilt;
        
    }
    
    private int helper(TreeNode root) {
        //two base cases
        if(root == null) return 0;
        //if root node is leaf node then return root.val.
        if(root.left == null & root.right == null) return root.val;
        
        int leftSum = helper(root.left);
        int rightSum = helper(root.right);
        
        tilt = tilt + Math.abs(leftSum - rightSum);
        return root.val + leftSum + rightSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
