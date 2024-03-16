package org.codeship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SortTheMatrix {

	//TC: O(N^2 * logN)
	//SC: O(N^2)
	public static int[][] sortedMatrix(int N, int mat[][]) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				list.add(mat[i][j]);
			}
		}

		Collections.sort(list);
		int k = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (k < list.size()) {
					mat[i][j] = list.get(k);
					k++;
				}
			}
		}

		return mat;
	}

	public static void main(String[] args) {
		int N = 4;
		int[][] Mat = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		int[][] sortedMat = sortedMatrix(N, Mat);

		// Print the sorted matrix
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(sortedMat[i][j] + " ");
			}
			System.out.println();
		}

	}

}

//public static class Element implements Comparable<Element> {
//	int value;
//
//	public Element(int value) {
//		this.value = value;
//	}
//
//	@Override
//	public int compareTo(Element other) {
//		return this.value - other.value;
//	}
//
//	@Override
//	public String toString() {
//		return "value=" + value;
//	}
//	
//	
//}
//
//public static int[][] sortMatrix(int[][] mat, int N) {
//	PriorityQueue<Element> minHeap = new PriorityQueue<>();
//
//	// Add all elements of the matrix to the min heap
//	for (int i = 0; i < N; i++) {
//		for (int j = 0; j < N; j++) {
//			minHeap.offer(new Element(mat[i][j]));
//		}
//	}
//
//	System.out.println(minHeap);
//	
//	// Retrieve elements from the heap and update the matrix
//	for (int i = 0; i < N; i++) {
//		for (int j = 0; j < N; j++) {
//			mat[i][j] = minHeap.poll().value;
//		}
//	}
//
//	return mat;
//}
