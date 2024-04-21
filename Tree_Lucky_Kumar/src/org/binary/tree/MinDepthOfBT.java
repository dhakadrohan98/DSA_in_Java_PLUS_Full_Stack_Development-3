package org.binary.tree;

public class MinDepthOfBT {

int min = Integer.MAX_VALUE;
    
    public int minDepth(TreeNode root) {
        //edge case
        if(root == null) {
            return 0;
        }
        helper(root, 1);
        return min;
    }
    
    public void helper(TreeNode root, int level) {
        //Two base cases
        if(root == null) {
            return;
        }
        //compare level with minDepth when root is a leaf node
        if(root.left == null && root.right == null) {
            min = Math.min(min, level);
        }
        
        helper(root.left, level+1);
        helper(root.right, level+1);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
