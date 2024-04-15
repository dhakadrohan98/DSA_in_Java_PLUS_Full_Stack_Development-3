package org.binary.tree;

public class PathSumIII {
	//@@12:20
	int total = 0;
    public int pathSum(TreeNode root, int targetSum) {
        //edge case
        if(root == null) return 0;
        
        //another methods call
        findPathSum(root, targetSum, 0);
        //recursive call on left & right subtree
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return total;
    }
    
    public void findPathSum(TreeNode root, int targetSum, int currSum) {
        //base case
        if(root == null) return;
        
        currSum += root.val;
        	
        if(targetSum == currSum)
            total++;
        
        findPathSum(root.left, targetSum, currSum);
        findPathSum(root.right, targetSum, currSum);
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
