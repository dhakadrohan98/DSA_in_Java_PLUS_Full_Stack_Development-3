package org.twopointer.revision;

public class SumofSquareNumbers {
	
	//TC: O(sqrt(c))
    //SC: O(1)
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);

        while(left <= right) {
            long total = left*left + right*right;
            if(total == c) {
                return true;
            } else if(total < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
