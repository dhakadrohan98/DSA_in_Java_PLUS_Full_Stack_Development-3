package org.designgurus.twopointer;

public class ThreeEqualParts {

	//Do dry run on below example to understand this algo
	//arr -> [0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1]
	//TC: O(n)
	//SC: O(1)
	public static int[] threeEqualParts(int[] arr) {
	    int[] ans = new int[] {-1,-1};

	    // num Of 1
	    int numOf1s = 0;
	    for (int el : arr) {
	      numOf1s += el;
	    }

	    if (numOf1s == 0) {
	      return new int[]{0, arr.length-1};
	    }

	    if (numOf1s % 3 != 0) {
	      return ans;
	    }

	    int noOfOnesInEachPart = numOf1s / 3;
	    int indexOfFirst1InPart0 = -1;
	    int indexOfFirst1InPart1 = -1;
	    int indexOfFirst1InPart2 = -1;
	    numOf1s = 0;
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] == 1) {
	        numOf1s++;
	        if (numOf1s == noOfOnesInEachPart + 1) {
	          indexOfFirst1InPart1 = i;
	        } else if (numOf1s == 2 * noOfOnesInEachPart + 1) {
	          indexOfFirst1InPart2 = i;
	        } else if (numOf1s == 1) {
	          indexOfFirst1InPart0 = i;
	        }
	      }
	    }

	    while (indexOfFirst1InPart2 < arr.length) {
	      if (arr[indexOfFirst1InPart2] == arr[indexOfFirst1InPart0] && arr[indexOfFirst1InPart2] == arr[indexOfFirst1InPart1]) {
	        indexOfFirst1InPart2++;
	        indexOfFirst1InPart1++;
	        indexOfFirst1InPart0++;
	      } else {
	        return ans;
	      }
	    }

	    return new int[]{indexOfFirst1InPart0 - 1, indexOfFirst1InPart1};
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
