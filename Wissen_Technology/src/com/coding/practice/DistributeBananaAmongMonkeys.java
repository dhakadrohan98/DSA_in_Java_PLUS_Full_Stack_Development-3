package com.coding.practice;

public class DistributeBananaAmongMonkeys {

	public static void main(String[] args) {
		int n = 6;
		boolean flag = false;
		
		if(n ==1 || n ==2) {
			flag = false;
		}
		else {
			for(int j=2; j<=n/2; j++) {
				if(n % j == 0) {
					flag = true;
					break;
				}
			}
		}
		
		if(flag) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
