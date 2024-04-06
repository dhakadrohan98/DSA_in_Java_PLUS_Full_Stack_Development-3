package org.binary.tree;

public class SumOfLeftLeaves {

	public int sumOfLeftLeaves(TreeNode root) {
        //edge case
        if (root == null) {
          return 0;   
        }
       
    int leftSum = 0;
    //base condition
    if(root.left != null && root.left.left == null && root.left.right == null) {
        leftSum += root.left.val;
    }
    //recursive call
    int leftSubTreeSum = sumOfLeftLeaves(root.left);
    int rightSubTreeSum = sumOfLeftLeaves(root.right);
    
    return leftSum + leftSubTreeSum + rightSubTreeSum;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
