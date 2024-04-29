package org.heap.algorithms;

//Time Complexity:  O(log(n)) (where n is no of elements in the heap)
//Auxiliary Space: O(n)
public class InsertIntoMaxHeap {
	// Function to heapify ith node in a Heap
	// of size n following a Bottom-up approach
	public static void heapify(int[] arr, int n, int i) {
		// Iterative approach => TC: O(logN) & SC: O(1)
		while (i > 1) {
			int parent = i / 2;
			if (arr[parent] < arr[i]) {
				// swaping(parent, i)
				int temp = arr[parent];
				arr[parent] = arr[i];
				arr[i] = temp;

				i = parent;
			} else {
				break;
			}

		}

		// Recursive approach => TC: O(logN) & SC: O(N) auxiliary space

//		 Find parent
//        int parent = i  / 2;
//		if (parent >= 1) {
//			// For Max-Heap
//			// If current node is greater than its parent
//			// Swap both of them and call heapify again
//			// for the parent
//			if (arr[i] > arr[parent]) {
//
//				// swap arr[i] and arr[parent]
//				int temp = arr[parent];
//				arr[parent] = arr[i];
//				arr[i] = temp;
//
//				// Recursively heapify the parent node
//				heapify(arr, n, parent);
//			}
//		}
	}

	// Function to insert a new node to the heap.
	public static int insertNode(int[] arr, int n, int Key) {
		// Increase the size of Heap by 1
		n = n + 1;
		// Insert the element at end of Heap
		arr[n - 1] = Key;
		// Heapify the new node following a
		// Bottom-up approach
		heapify(arr, n, n - 1);
		// return new size of Heap
		return n;
	}

	/* A utility function to print array of size n */
	public static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; ++i)
			System.out.println(arr[i] + " ");

		System.out.println();
	}

	// Driver Code
	public static void main(String args[]) {
		// Array representation of Max-Heap
		// 10
		// / \
		// 5 3
		// / \
		// 2 4

		// maximum size of the array
		int MAX = 1000;
		int[] arr = new int[MAX];

		// initializing some values
		arr[1] = 10;
		arr[2] = 5;
		arr[3] = 3;
		arr[4] = 2;
		arr[5] = 4;

		// Current size of the array
		int n = 6;

		// the element to be inserted
		int Key = 15;

		// The function inserts the new element to the heap and
		// returns the new size of the array
		n = insertNode(arr, n, Key);

		printArray(arr, n);
		// Final Heap will be:
		// 15
		// / \
		// 5 10
		// / \ /
		// 2 4 3
		
		n = insertNode(arr, n, 25);
		printArray(arr, n);
	}
}
