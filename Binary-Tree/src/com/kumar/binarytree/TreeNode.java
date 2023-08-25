package com.kumar.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {
	
	private TreeNode left;
	private TreeNode right;
	private int data;
	
	private TreeNode root;
	
	//Get root node
	public TreeNode getRoot() {
		return this.root;
	}
	
	//Get data of current node
	public int getData() {
		return data;
	}
	
	public TreeNode() {
		super();
	}
	public TreeNode(int data) {
		this.data = data;
	}
	
	public void createBinaryTree() {
		
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(22);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		
		root = first;
		first.left = second;    // second<---first--->third
		first.right = third;
		second.left = fourth;   // fourth<---second--->fifth
		second.right = fifth;
		third.right = sixth;    // null<---third--->sixth
		System.out.println("Binary Tree Created successfully");
		
//		TreeNode first = new TreeNode(1);
//		TreeNode second = new TreeNode(2);
//		TreeNode third = new TreeNode(3);
//		TreeNode fourth = new TreeNode(4);
//		TreeNode fifth = new TreeNode(5);
//		TreeNode sixth = new TreeNode(6);
//		root = first;
//		first.left = second; //    second<---first--->third
//		first.right = third;
//		second.left = fourth;//     fourth<---second--->fifth
//		second.right = fifth;
//		third.left = sixth;//      sixth<--third-->null
		
//		TreeNode first = new TreeNode(9);
//		TreeNode second = new TreeNode(2);
//		TreeNode third = new TreeNode(4);
//		TreeNode fourth = new TreeNode(5);
//		TreeNode fifth = new TreeNode(3);
//		TreeNode sixth = new TreeNode(6);
//		TreeNode seventh = new TreeNode(7);
//		root = first;
//		first.left = second; //    second<---first--->fifth
//		first.right = fifth;
//		second.left = third;//     third<---second--->fourth
//		second.right = fourth;
//		fifth.left = sixth;//      sixth<--fifth-->seventh
//		fifth.right = seventh;
	}
	
	//PreOrder (Boundary level) Traversal (DLR)
	public void recPreorder(TreeNode root) {
		// Base case to break recursive call
		if(root == null) {
			return;
		}
		System.out.print(root.data + ", ");
		recPreorder(root.left);
		recPreorder(root.right);

	}
	
	//Iterative PreOrder(Boundary level) traversal (DLR)
	public void itrPreorder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + ", ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
	    }
	}
	
	//Recursive InOrder traversal (LDR)
	public void recInorder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		recInorder(root.left);
		System.out.print(root.data + ", ");
		recInorder(root.right);
	}
	
	//Iterative InOrder traversal of BT (LDR)
	public void itrInorder(TreeNode root) {
		if(root == null) {
			return; 
		}
		
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		
		while(!stack.isEmpty() || temp!=null) {
			
			if(temp!=null) {
				stack.push(temp);
				temp = temp.left;
			}
			else {
				temp = stack.pop();
				System.out.print(temp.data + ", ");
				temp = temp.right;
			}
		}
	}
	
	
	//Recursive postOrder traversal methods
	public void postOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + ", ");
	}
	
	//Iterative postOrder traversal
	public void itrPostOrder(TreeNode root) {
		TreeNode current = root;
		//Stack will use to store nodes
		Stack<TreeNode> stack = new Stack<>();
		while(current != null || !stack.isEmpty()) {
			if(current != null) {
				stack.push(current);
				current = current.left; //Assign current to left subtree side if current is not null.
			}
			else {
				//Get right subtree value in temp variable of TreeNode type.
				TreeNode temp = stack.peek().right;
				if(temp == null) { //if temp is null, it means there are no childrens at right subtree side to visit.
					temp = stack.pop(); //Get parent node out of stack & print it.
					System.out.print(temp.data + ", ");
					//if temp is pointing to right subtree of a Node then backtrack & print parent node iteratively.
					while(!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data + ", ");
					}
				}
				//If temp is not null, it means, there are nodes at right subtree side to visit. 
				else {
					current = temp; // Assign temp to Current. Now current is pointing to right subtree side.
				}
			}
		}
	}
	
	//Level Order Traversal (Iterative approach)
	public void levelOrderTraversal(TreeNode root) {
		//Base case
		if(root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data+ ", ");
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
			
		}
	}
	
	//Find Maximum value
	//Intuition=> Find maximum value in LST & then RST. Then compare max values of LST, RST and 
	//root.data with each other, whichever is greater value among three values that is final answer.
	public int findMax(TreeNode root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		//Recursively calling findMax() with root.left params each time until we reached till leaf 
		//nodes of LST.Then store values in left(int) variable.
		int left = findMax(root.left);
		//Recursively calling findMax() with root.right params each time until we reached till leaf 
		//nodes of RST.Then store values in right(int) variable.
		int right = findMax(root.right);
		
		//Start comparing for three values (root.data, left, right) from bottom subtree of given tree.
		if(left > result) {
			result = left;
		}
		
		if(right > result) {
			result = right;
		}
		return result;
	}
	
}
