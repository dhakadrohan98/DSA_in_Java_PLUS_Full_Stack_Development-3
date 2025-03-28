package org.designgurus.twopointer;

public class SumofSquareNumbers {

	public static boolean judgeSquareSum(int c) {
        
		for(int a=0; a <= Math.sqrt(c); a++) {
			double sqrt = Math.sqrt(c - a*a);
			if(sqrt - Math.floor(sqrt) == 0) {
				return true;
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		int c = 89;
		System.out.println(judgeSquareSum(c));
	}

}
