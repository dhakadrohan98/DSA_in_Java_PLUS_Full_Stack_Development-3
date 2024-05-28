package com.practice;

//you have to distribute N bananas equally among some monkeys according to the following condition

//each monkey 
//1 monkey -> more than 1 bananas

//3/2 = 1
// 4/2 = 2;

// 15/2 = 7;

//n=15
//15/8 = 1;
public class DistributeNBananas {

	public static boolean distribute(int n) {
		//base case
		if(n <= 3) {
			return false;
		}
		
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
