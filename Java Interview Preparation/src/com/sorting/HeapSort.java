package com.sorting;

public class HeapSort {
	public void sort(int[] arr) {
		int leng = arr.length;
		// Build Max heap
		for(int i = (leng/2) - 1; i >= 0; i--) {
			heapify(arr, leng, i);
		}
		
		//swap the elements(arr[0] <-> arr[leng-1]) & heapify again
		for(int i = leng-1; i>=0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			// Heapify root element
			heapify(arr, i, 0);
		}
	}
	
	public void heapify(int[] arr, int arrLength, int i) {
		// Find largest among root, left child and right child
		int largest = i;  //parent node index position
		int leftIndex = 2*i + 1; //left child node index position
		int rightIndex = 2*i + 2; //right child node index position
		
		if(leftIndex < arrLength && arr[leftIndex] > arr[largest]) {
			largest = leftIndex;
		}
		
		if(rightIndex < arrLength && arr[rightIndex] > arr[largest]) {
			largest = rightIndex;
		}
		
		// Swap and continue heapifying if root is not largest
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, arrLength, largest);
		}
		
	}

	// Function to print an array
    public void printArray(int arr[]) {
      for (int i = 0; i < arr.length; ++i)
        System.out.print(arr[i] + " ");
    }
	
	public static void main(String[] args) {
		int[] arr = {22,13,17,3,11,10,14,29,25,47,34};
		HeapSort hs = new HeapSort();

		hs.sort(arr);
		hs.printArray(arr);
	}
}
