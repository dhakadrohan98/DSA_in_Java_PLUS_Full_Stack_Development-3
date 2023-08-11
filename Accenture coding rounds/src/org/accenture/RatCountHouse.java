package org.accenture;

public class RatCountHouse {

	public static void main(String[] args) {
		int r = 11;
		int unit =3;
		int[] arr= {2, 8, 3, 5, 7, 4, 1, 2};
		boolean flag=false;
		
		int foodConsumed = r*unit;
		int totalAmountOfFood = 0;
		
		for(int i=0; i<arr.length; i++) {
			totalAmountOfFood += arr[i];
			
			if(totalAmountOfFood >= foodConsumed) {
				System.out.println(i+1);
				flag = true;
				break;
			}
		}
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		if(!flag) {
			System.out.println(0);
		}

	}

}
