package org.binary.search.tree;

public class ValidateBST {
	//TC: O(N)
    //SC: O(N) stack space
    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return isValidBST(root, min, max);
    }
    
    public boolean isValidBST(TreeNode root, long min, long max) {
        //two base cases
        if(root == null) {
            return true;
        }
        //curr root value is out of range [min,max]
        if(root.val <= min || root.val >= max) {
            return false;
        }
        
        return (isValidBST(root.left, min, root.val) && 
            isValidBST(root.right, root.val, max));
    }
}
