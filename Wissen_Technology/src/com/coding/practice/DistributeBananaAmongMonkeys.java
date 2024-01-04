package com.coding.practice;

public class DistributeBananaAmongMonkeys {

	public static void main(String[] args) {
		int n = 2;
		boolean flag = false;
		for(int j=2; j<=n/2; j++) {
			if(n % j == 0) {
				flag = true;
			}
		}
		
		//Flag
		if(flag) {
			System.out.println(flag);
		} else if(flag == false) {
			System.out.println(flag);
		}
	}

}
