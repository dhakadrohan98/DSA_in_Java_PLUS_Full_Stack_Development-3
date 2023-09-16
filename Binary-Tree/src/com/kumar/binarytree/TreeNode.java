package com.kumar.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class TreeNode {

	private TreeNode left;
	private TreeNode right;
	private TreeNode next;
	private int data;

	private TreeNode root;

	// Get root node
	public TreeNode getRoot() {
		return this.root;
	}

	// Get data of current node
	public int getData() {
		return this.data;
	}

	public TreeNode() {
		super();
	}

	public TreeNode(int data) {
		this.data = data;
	}

	public void createBinaryTree1() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(22);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode ninth = new TreeNode(7);
		TreeNode tenth = new TreeNode(9);

		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = tenth;
		third.left = ninth;
		third.right = tenth;
		fourth.right = fifth;
		fifth.right = sixth;
	}

	public void createBinaryTree() {

		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(22);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);

		root = first;
		first.left = second; // second<---first--->third
		first.right = third;
		second.left = fourth; // fourth<---second--->fifth
		second.right = fifth;
		third.right = sixth; // null<---third--->sixth
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

	public void createBTForDiagonalElements() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		TreeNode eighth = new TreeNode(8);
		TreeNode ninth = new TreeNode(9);

		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		third.left = fifth;
		third.right = sixth;
		fifth.left = seventh;
		fifth.right = eighth;
		seventh.right = ninth;
	}

	public void createBTforBLT() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		TreeNode eighth = new TreeNode(8);
		TreeNode ninth = new TreeNode(9);
		TreeNode tenth = new TreeNode(10);
		TreeNode eleventh = new TreeNode(11);

		root = first;
		first.left = second;
		first.right = seventh;
		second.left = third;
		third.right = fourth;
		fourth.left = fifth;
		fourth.right = sixth;
		seventh.right = eighth;
		eighth.left = ninth;
		ninth.left = tenth;
		ninth.right = eleventh;
	}

	// PreOrder (Boundary level) Traversal (DLR)
	public void recPreorder(TreeNode root) {
		// Base case to break recursive call
		if (root == null) {
			return;
		}
		System.out.print(root.data + ", ");
		recPreorder(root.left);
		recPreorder(root.right);

	}

	// Iterative PreOrder(Boundary level) traversal (DLR)
	public void itrPreorder(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + ", ");
			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				stack.push(temp.left);
			}
		}
	}

	// Recursive InOrder traversal (LDR)
	public void recInorder(TreeNode root) {
		if (root == null) {
			return;
		}

		recInorder(root.left);
		System.out.print(root.data + ", ");
		recInorder(root.right);
	}

	// Iterative InOrder traversal of BT (LDR)
	public void itrInorder(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;

		while (!stack.isEmpty() || temp != null) {

			if (temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data + ", ");
				temp = temp.right;
			}
		}
	}

	// Recursive postOrder traversal methods
	public void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + ", ");
	}

	// Iterative postOrder traversal
	public void itrPostOrder(TreeNode root) {
		TreeNode current = root;
		// Stack will use to store nodes
		Stack<TreeNode> stack = new Stack<>();
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left; // Assign current to left subtree side if current is not null.
			} else {
				// Get right subtree value in temp variable of TreeNode type.
				TreeNode temp = stack.peek().right;
				if (temp == null) { // if temp is null, it means there are no childrens at right subtree side to
									// visit.
					temp = stack.pop(); // Get parent node out of stack & print it.
					System.out.print(temp.data + ", ");
					// if temp is pointing to right subtree of a Node then backtrack & print parent
					// node iteratively.
					while (!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data + ", ");
					}
				}
				// If temp is not null, it means, there are nodes at right subtree side to
				// visit.
				else {
					current = temp; // Assign temp to Current. Now current is pointing to right subtree side.
				}
			}
		}
	}

	// Level Order Traversal (Iterative approach)
	public void levelOrderTraversal(TreeNode root) {
		// Base case
		if (root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data + ", ");
			if (temp.left != null) {
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				queue.offer(temp.right);
			}

		}
	}

	// Find Maximum value
	// Intuition=> Find maximum value in LST & then RST. Then compare max values of
	// LST, RST and
	// root.data with each other, whichever is greater value among three values that
	// is final answer.
	public int findMax(TreeNode root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		// Recursively calling findMax() with root.left params each time until we
		// reached till leaf
		// nodes of LST.Then store values in left(int) variable.
		int left = findMax(root.left);
		// Recursively calling findMax() with root.right params each time until we
		// reached till leaf
		// nodes of RST.Then store values in right(int) variable.
		int right = findMax(root.right);

		// Start comparing for three values (root.data, left, right) from bottom subtree
		// of given tree.
		if (left > result) {
			result = left;
		}

		if (right > result) {
			result = right;
		}
		return result;
	}

	// Leetcode #101
	// Given the root of a binary tree, check whether it is a mirror of itself
	// (i.e., symmetric around its center)
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root.right);
		stack.push(root.left);

		while (!stack.isEmpty()) {
			TreeNode n1 = stack.pop();
			TreeNode n2 = stack.pop();
			if (n1 == null && n2 == null)
				continue;

			if (n1 == null || n2 == null || n1.data != n2.data) {
				return false;
			}

			stack.push(n1.left);
			stack.push(n2.right);
			stack.push(n1.right);
			stack.push(n2.left);
		}
		return true;
	}

	// Diagonal Traversal of tree
	public void printDiagonal(TreeNode root, int diagonal, Map<Integer, List<Integer>> map) {
		if (root == null)
			return;

		map.putIfAbsent(diagonal, new ArrayList<>());

		// Recursive preOrder traversal.
		map.get(diagonal).add(root.data);
		printDiagonal(root.left, diagonal + 1, map);
		printDiagonal(root.right, diagonal, map);

	}

	// print Diagonal elements.
	public void printDiagonal(TreeNode root) {
		Map<Integer, List<Integer>> map = new HashMap<>();

		// calling preOrder traversal
		printDiagonal(root, 0, map);

		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
	}

	// Boundary Traversal methods

	public boolean isLeaf(TreeNode node) {
		if (node.left == null && node.right == null) {
			return true;
		} else {
			return false;
		}
	}

	// Add left boundary
	public void addLeftBoundary(TreeNode root, ArrayList<Integer> res) {
		TreeNode curr = root.left;
		while (curr != null) {
			// checking leaf node condition
			if (!isLeaf(curr)) {
				res.add(curr.data);
			}

			if (curr.left != null) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
	}

	// Add right boundary method
	public void addRightBoundary(TreeNode root, ArrayList<Integer> res) {
		TreeNode curr = root.right;
		ArrayList<Integer> temp = new ArrayList<>();
		while (curr != null) {
			// checking leaf node condition
			if (!isLeaf(curr)) {
				temp.add(curr.data);
			}

			if (curr.right != null) {
				curr = curr.right;
			} else {
				curr = curr.left;
			}
		}
		// put elements of temp list into res list in reverse manner.
		for (int i = temp.size() - 1; i >= 0; i--) {
			res.add(temp.get(i));
		}
	}

	// Adding leaf nodes into res(List).
	// Traverse from root towards left subtree first & then towards right subtree in
	// recursive manner.
	public void addLeaves(TreeNode root, ArrayList<Integer> res) {
		// If Given BT has one node only, that is only left & right subtree itself.
		// Base case
		if (isLeaf(root)) {
			res.add(root.data);
			return;
		}
		// Recursive call.
		if (root.left != null) {
			addLeaves(root.left, res);
		}
		if (root.right != null) {
			addLeaves(root.right, res);
		}
	}

	// Boundary Traversal function starts from here
	public ArrayList<Integer> printBoundary(TreeNode node) {
		ArrayList<Integer> ans = new ArrayList<Integer>();

		if (!isLeaf(node)) {
			ans.add(root.data);
		}
		addLeftBoundary(node, ans);
		addLeaves(node, ans);
		addRightBoundary(node, ans);
		return ans;
	}

	// Zig zag level order traversal
	public List<List<Integer>> zigzagOrderTraversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> wrapList = new ArrayList<>();

		if (root == null) {
			return wrapList;
		}

		queue.offer(root);
		boolean flag = true;

		while (!queue.isEmpty()) {
			int levelNum = queue.size();

			// To store nodes of a level from LtoR or RtoL(in a reverse manner)
			List<Integer> subList = new ArrayList<Integer>();

			for (int i = 0; i < levelNum; i++) {

				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}

				if (flag == true) {
					subList.add(queue.poll().data);
				} else {
					// Adding elements in a reverse manner when flag value is false(it means
					// we have to traverse from right to left in this case)
					subList.add(0, queue.poll().data);
				}
			} // for CB.

			// setting opposite of flag value to the flag variable in order to find
			// direction of traversing.
			// L to R (flag=true)
			// R to L (flag==false)
			flag = !flag;

			wrapList.add(subList);
		} // while CB
		return wrapList;
	}// zigzagOrderTraversal CB

	// Top and Bottom View of Binary Tree method implementation starts from here.
	// Pair class to store values of Node & its state
	private class Pair {
		TreeNode node;
		int state;

		Pair(TreeNode node, int state) {
			this.node = node;
			this.state = state;
		}
	}

	// Actual Top View of Binary Tree method's implementation
	public ArrayList<Integer> topView(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(root, 0));
		while (!q.isEmpty()) {
			Pair it = q.remove();
			int state = it.state;
			TreeNode temp = it.node;
			if (map.get(state) == null)
				map.put(state, temp.data);
			if (temp.left != null) {

				q.add(new Pair(temp.left, state - 1));
			}
			if (temp.right != null) {

				q.add(new Pair(temp.right, state + 1));
			}
		}

		// Map traversing techniques

//        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            ans.add(entry.getValue()); 
//        }

		for (int key : map.keySet()) {
			ans.add(map.get(key));
		}
		return ans;

	}

	// TC: O(n)
	// Actual Bottom View of Binary Tree method's implementation
	public ArrayList<Integer> bottomView(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(root, 0));
		while (!q.isEmpty()) {
			Pair it = q.remove();
			int state = it.state;
			TreeNode temp = it.node;
			// through below line, i will store data of last node of a particular number
			// line (like -2,-1,-0,1,2)
			map.put(state, temp.data);
			if (temp.left != null) {

				q.add(new Pair(temp.left, state - 1));
			}
			if (temp.right != null) {

				q.add(new Pair(temp.right, state + 1));
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			ans.add(entry.getValue());
		}
		return ans;

	}

	// Right side view of BT
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		rightView(root, 0, res);
		return res;
	}

	// Right view of BT
	public void rightView(TreeNode node, int level, List<Integer> res) {
		if (node == null) {
			return;
		}

		if (level == res.size()) {
			res.add(node.data);
		}

		rightView(node.right, level + 1, res);
		rightView(node.left, level + 1, res);
	}

	// Left side view of BT
	public List<Integer> leftSideView(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		leftView(root, 0, res);
		return res;
	}

	// Left view of BT
	public void leftView(TreeNode node, int level, List<Integer> res) {
		if (node == null) {
			return;
		}

		if (level == res.size()) {
			res.add(node.data);
		}

		leftView(node.left, level + 1, res);
		leftView(node.right, level + 1, res);
	}

	// 236. Lowest Common Ancestor of a Binary Tree
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// base case
		if (root == null || root == p || root == q) {
			return root;
		}

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		// result
		if (left == null) {
			return right;
		}

		else if (right == null) {
			return left;
		}

		else {// both left and right are not null. we found our result
			return root;
		}
	}

	// Create BT for calculating height of BT
	public void createBTForHeight() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		TreeNode eight = new TreeNode(8);
		TreeNode ninth = new TreeNode(9);

		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.right = seventh;
		fifth.left = sixth;
		sixth.left = eight;
		eight.left = ninth;
	}

	// Max depth of a tree
	public int maxDepth(TreeNode root) {
		if (root == null) { // Base case
			return 0;
		}
		int maxLeft = maxDepth(root.left);
		int maxRight = maxDepth(root.right);

		return 1 + Math.max(maxLeft, maxRight);
	}

	// Diameter of binary Tree
	public int diameterOfBinaryTree(TreeNode root) {
		int[] diameter = new int[1];
		height(root, diameter);
		return diameter[0];
	}

	private int height(TreeNode node, int[] diameter) {
		if (node == null) {
			return 0;
		}
		int lh = height(node.left, diameter);
		int rh = height(node.right, diameter);
		diameter[0] = Math.max(diameter[0], lh + rh);
		return 1 + Math.max(lh, rh);
	}

	public void createSumTree() {
		TreeNode first = new TreeNode(44);
		TreeNode second = new TreeNode(9);
		TreeNode third = new TreeNode(13);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		
		first = root;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
	}

	// Check if a binary tree is a sum or not
	public static int isSumTree(TreeNode root)
    {
        // base case: empty tree
        if (root == null) {
            return 0;
        }
 
        // special case: leaf node
        if (root.left == null && root.right == null) {
            return root.data;
        }
 
        int left = isSumTree(root.left);
        int right = isSumTree(root.right);
 
        // if the root's value is equal to the sum of all elements present in its
        // left and right subtree
        if (left != Integer.MIN_VALUE && right != Integer.MIN_VALUE &&
                root.data == left + right) {
            return 2*root.data;
        }
 
        return Integer.MIN_VALUE;
    }
	
	// Balanced Binary Tree
	public boolean isBalanced(TreeNode root) {
		return dfsHeight(root) != -1;
	}

	public int dfsHeight(TreeNode root) {
		if (root == null)
			return 0;

		int leftHeight = dfsHeight(root.left);
		if (leftHeight == -1)
			return -1;
		int rightHeight = dfsHeight(root.right);
		if (rightHeight == -1)
			return -1;

		if (Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	//Binary Search Tree questiosn practiced********************************************
	
	//Minimum element in BST
		public int minValue(TreeNode node) {
        
        TreeNode root= node;
        int min = -1;
        
        if(root == null) {
            return min;
        }
        
        if(root.left != null) {
            while(root != null){
                min = root.data;
                root = root.left;
            }
        } else {
            min = root.data;
        }
        return min;
     }
		
		//Delete a node in BST
		public TreeNode deleteNode(TreeNode root, int key) {
	        if (root == null) {
	            return null;
	        }
	        if (root.data == key) {
	            return helper(root);
	        }
	        TreeNode dummy = root;
	        while (root != null) {
	            if (root.data > key) {
	                if (root.left != null && root.left.data == key) {
	                    root.left = helper(root.left);
	                    break;
	                } else {
	                    root = root.left;
	                }
	            } else {
	                if (root.right != null && root.right.data == key) {
	                    root.right = helper(root.right);
	                    break;
	                } else {
	                    root = root.right;
	                }
	            }
	        }
	        return dummy;
	    }
	    public TreeNode helper(TreeNode root) {
	            if (root.left == null) {
	                return root.right;
	            } else if (root.right == null){
	                return root.left;
	            } else {
	                TreeNode rightChild = root.right;
	                TreeNode lastRight = findLastRight(root.left);
	                lastRight.right = rightChild;
	                return root.left;
	            }
	    }
	    public TreeNode findLastRight(TreeNode root) {
	        if (root.right == null) {
	            return root;
	        }
	        return findLastRight(root.right);
	    }
	    
	    //InOrder successor in BST
	    public TreeNode inorderSuccessor(TreeNode root, TreeNode key) {
	    	TreeNode succ = null;
	    	
	    	while(root != null) {
	    		if(root.data <= key.data) {
	    			root= root.right;
	    		}
	    		else { //if(key < root.data)
	    			succ = root;
	    			root = root.left;
	    		}
	    	}
	    	return succ;
	    }
	    
	    //InOrder Predecessor in BST
	    public TreeNode inorderPredecessor(TreeNode root, TreeNode key) {
	    	TreeNode pre = null;
	    	
	    	while(root != null) {
	    		if(root.data < key.data) {
	    			pre = root;
	    			root= root.right;
	    		}
	    		else { //if(key > root.data)
	    			root = root.left;
	    		}
	    	}
	    	return pre;
	    }
	    
	    //Populate Inorder Successor for all nodes(Topics: BST)
	    public static TreeNode prev=null;
	    
	    //Inorder traversal
	    public void solve(TreeNode root,TreeNode prev) {
	    	if(root == null) {
	    		return;
	    	}
	    	//Left subtree traversal
	    	solve(root.left,prev);
	    	//Main logic for root node
	    	if(prev != null) {
	    		prev.next = root;
	    	}
	    	prev = root;
	    	//Right subtree traversal
	    	solve(root.right,prev);
	    }
	    public void populateNext(TreeNode root) {
	    	solve(root, prev);
	    }
	    
	    //Construct Binary Search Tree from Preorder Traversal
	    //Amazon: 4 Microsoft:3 Facebook:2 Bloomberg:2
	    public TreeNode bstFromPreorder(int[] A) {
	        return bstFromPreorder(A, Integer.MAX_VALUE, new int[]{0});
	    }
	    
	    public TreeNode bstFromPreorder(int[] A,int bound,int[] i) {
	        if(i[0] == A.length || A[i[0]] > bound){ //if array is of length 1 or value of array is greater than bound(Integer.MAX_VALUE), then simply return null.
	            return null;
	        }
	        
	        TreeNode root = new TreeNode(A[i[0]++]);
	        root.left =  bstFromPreorder(A, root.data, i);
	        root.right = bstFromPreorder(A, bound, i);
	        return root;
	    }
	    
	    //convert Binary Tree to BST (keeps the original structure of Binary Tree intact.)
	    
	    int i=0;
	    // The given root is the root of the Binary Tree
	    // Return the root of the generated BST
	    public TreeNode binaryTreeToBST(TreeNode root)
	    {
	       ArrayList<Integer> list = new ArrayList<>();
	       getNodes(root,list);
	       Collections.sort(list);
	       inorder(root,list); //passing root of binary tree 
	       return root;
	    }
	    
	    void getNodes(TreeNode root, ArrayList<Integer> list) {
	        if(root==null) return;
	        list.add(root.data);
	        getNodes(root.left, list);
	        getNodes(root.right, list);
	    }
	    
	    void inorder(TreeNode root,ArrayList<Integer> list) {
	        if(root==null) return;
	        inorder(root.left, list);
	        root.data = list.get(i++);
	        inorder(root.right, list);
	    }
	    
	    //Creating sample BST for testing of below methods: normalBSTToBalancedBST(root);
	    public void createBinarySeachTree() {
			TreeNode first = new TreeNode(1);
			TreeNode second = new TreeNode(2);
			TreeNode third = new TreeNode(3);
			TreeNode fourth = new TreeNode(4);
			TreeNode fifth = new TreeNode(5);
			TreeNode sixth = new TreeNode(6);
			TreeNode seventh = new TreeNode(7);
			
			root = seventh;
			seventh.left = sixth;
			sixth.left = fifth;
			fifth.left = fourth;
			fourth.left = third;
			third.left = second;
			second.left = first;
		}
	    
	    //**************************************************************************************
	    //convert a normal BST into balanced BST
	    static List<Integer> list = new ArrayList<>();
	    int j=0;
	    public TreeNode normalBSTToBalancedBST(TreeNode root, int n) {
	    	System.out.println("is inorder called: "+root.data);
	    	inorder(root);
	    	System.out.println(list);
	    	int start=0;
	    	int end = list.size()-1; // 7-1=6;
	    	TreeNode node = solve(start,end);
	    	return node;
	    }
	    
	    //Adding nodes to list while traversing inorder
	    public void inorder(TreeNode root) {
	    	if(root == null) {
	    		return;
	    	}
	    	inorder(root.left);
	    	list.add(root.data);
	    	inorder(root.right);
	    }
	    
	    //Real logic of BST into balanced BST here
	    public TreeNode solve(int start, int end) {
	    	if(start > end) {
	    		return null;
	    	}
	    	
	    	int mid = (start+end)/2;
	    	System.out.println("mid val: "+mid);
	    	TreeNode root = new TreeNode(list.get(mid));
	    	root.left = solve(start, mid-1);
	    	root.right = solve(mid+1, end);
	    	return root;
	    }
	    //****************************************************************************************
	    
}
