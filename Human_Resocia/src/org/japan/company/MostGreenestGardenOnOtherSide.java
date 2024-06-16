package org.japan.company;

import java.util.Arrays;

public class MostGreenestGardenOnOtherSide {

	// Code by Rohan
	public static int[] calculateGreenness(int[] arr) {
		int firstMax = arr[0];
		int secondMax = arr[0];
		int[] result = new int[arr.length];

		// first maximum & second maximum
		for (int i = 1; i < arr.length; ++i) {

			if (arr[i] >= firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			}

			else if (arr[i] > secondMax && arr[i] < firstMax) {
				secondMax = arr[i];
			}
		}
//			System.out.println(firstMax);
//			System.out.println(secondMax);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == firstMax) {
				result[i] = secondMax;
			} else {
				result[i] = firstMax;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// Define the greenness of each garden
		int[] greenness = { -10, 2, 100000 };
		int[] greenness1 = { 1, 3 };
		// Calculate the "greenness on the other side" for each garden
		int[] result = calculateGreenness(greenness);
		// Print the result
		System.out.println(Arrays.toString(result));

		// Calculate the "greenness on the other side" for each garden
		int[] result1 = calculateGreenness(greenness1);
		// Print the result
		System.out.println(Arrays.toString(result1));

	}

}

//code by Chegg:
//
//public static int[] calculateGreenness(int[] greenness) {
//int n = greenness.length;
//// Initialize arrays to store the maximum greenness on the left and right of
//// each garden
//int[] leftMax = new int[n];
//int[] rightMax = new int[n];
//// Initialize a stack to help calculate the maximum greenness
//Stack<Integer> stack = new Stack<>();
//
//// Calculate the maximum greenness on the left of each garden
//for (int i = 0; i < n; i++) {
//	// Pop elements from the stack while the top element is less than or equal to
//	// the current element
//	while (!stack.isEmpty() && greenness[stack.peek()] <= greenness[i]) {
//		stack.pop();
//	}
//	// If the stack is empty, there is no greener garden on the left
//	// Otherwise, the top element of the stack is the greener garden on the left
//	leftMax[i] = stack.isEmpty() ? -1 : greenness[stack.peek()];
//	// Push the current element onto the stack
//	stack.push(i);
//}
//
//// Clear the stack for the next calculation
//stack.clear();
//
//// Calculate the maximum greenness on the right of each garden
//for (int i = n - 1; i >= 0; i--) {
//	// Pop elements from the stack while the top element is less than or equal to
//	// the current element
//	while (!stack.isEmpty() && greenness[stack.peek()] <= greenness[i]) {
//		stack.pop();
//	}
//	// If the stack is empty, there is no greener garden on the right
//	// Otherwise, the top element of the stack is the greener garden on the right
//	rightMax[i] = stack.isEmpty() ? -1 : greenness[stack.peek()];
//	// Push the current element onto the stack
//	stack.push(i);
//}
//
//// Initialize an array to store the result
//int[] result = new int[n];
//// Calculate the "greenness on the other side" for each garden
//for (int i = 0; i < n; i++) {
//	result[i] = Math.max(leftMax[i], rightMax[i]);
//}
//
//// Return the result
//return result;
//}
