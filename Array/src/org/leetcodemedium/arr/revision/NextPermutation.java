package org.leetcodemedium.arr.revision;

public class NextPermutation {
	
	//TC: O(n)
    //SC: O(n)
    private void reverse(int[] arr, int i, int j) {
        while(i < arr.length && j >= 0 &&  i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
    public void nextPermutation(int[] arr) {
        // [2, 1, 5, 4, 3, 0, 0]
        int n = arr.length;
        int indx = -1;
        //[1, 2, 3, 4, 5]
        //find the break point
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                indx = i; // 1
                break;
            }
        }
        //if break point is not found, it means it was the last permutation
        if(indx == -1) {
            reverse(arr, 0, n-1);
            return;
        }

        //Step2 - 
        for(int i = n-1; i >= indx; i--) {
            if(arr[i] > arr[indx]) {
                //swap(arr[i], arr[indx])
                int temp = arr[i];
                arr[i] = arr[indx];
                arr[indx] = temp;
                break;
            }
        }

        //Step3 - reverse (from indx+1, n-1)
        reverse(arr, indx+1, n-1);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
