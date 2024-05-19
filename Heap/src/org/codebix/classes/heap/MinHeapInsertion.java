package org.codebix.classes.heap;

public class MinHeapInsertion {
	
	

	public void insert(int[] arr, int element) {
		int n = arr.length;
		n = n+1;
		arr[n-1] = element;
		int i = n-1;
		
		while(i > 0) {
			int parent = (i-1)/2;
			if(arr[parent] > arr[i]) {
				swap(parent, i, arr);
				i = parent;
			}
			else {
				break;
			}
		}
		
	}
	
	private void swap(int parent, int i, int[] arr) {
		int temp = arr[parent];
		arr[parent] = arr[i];
		arr[i] = temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
