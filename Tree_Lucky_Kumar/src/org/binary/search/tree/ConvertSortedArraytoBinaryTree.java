package org.binary.search.tree;

public class ConvertSortedArraytoBinaryTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    
    private TreeNode helper(int[] nums, int low, int high) {
        if (low > high) {
            return null; // Base case: empty subtree
        }
        int mid = low + (high - low) / 2; // Avoid integer overflow
        TreeNode node = new TreeNode(nums[mid]);

        // Recursively build left and right subtrees
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums, mid + 1, high);

        return node;
    }
}
