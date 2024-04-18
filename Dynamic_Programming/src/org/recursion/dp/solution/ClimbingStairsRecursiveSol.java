package org.recursion.dp.solution;

public class ClimbingStairsRecursiveSol {
	//TC: O(n)
	//SC: O(n) - stack space
	//Recursive solution
	public static int climbStairs(int n) {
		//two base case
		if(n == 0 || n == 1) return 1;
		
		int left = climbStairs(n-1);
		int right = climbStairs(n-2);
		//sum of all stuffs
		return left + right;
	}
	public static void main(String[] args) {
		int num = 3;
		System.out.println(climbStairs(num));

	}

}
