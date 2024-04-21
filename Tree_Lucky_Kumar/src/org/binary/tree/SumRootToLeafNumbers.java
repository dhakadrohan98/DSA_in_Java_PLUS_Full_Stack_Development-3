package org.binary.tree;

public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
      }
      
       private int dfs(TreeNode node, int currentSum) {
          if (node == null) {
              return 0;
          }
          
          currentSum = currentSum * 10 + node.val;
          
          if (node.left == null && node.right == null) {
              return currentSum;
          }
          
          return dfs(node.left, currentSum) + dfs(node.right, currentSum);
      }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
