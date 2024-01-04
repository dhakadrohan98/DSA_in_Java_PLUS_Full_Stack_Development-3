package com.coding.practice;

public class BinaryStringToInt {
	private static int max=0;

	private static double convertDecimal(String str) {
		
		double result = 0;
		
		for(int i=0; i<str.length(); i++) { //i=2;
			String intr = ""+str.charAt(i); 
			int temp = Integer.valueOf(intr);  //temp=1  
			
			if(i == str.length()-1) {
				result = result+1;
				int startingNumber = (int)result;
				boolean prime2 = isPrime(startingNumber);
				System.out.println("Maximum prime numbers: "+max);
			}
			else {
				if(temp != 0) {
					result = result + Math.pow(2, str.length()-1-i);
					//checking prime numbers from 1 to result
					int startingNumber = (int)result;
					boolean prime3 = isPrime(startingNumber);
				}
			}
		}
		return result;
	}
	
	public static boolean isPrime(int startingNumber) {
		boolean prime = true;
		
		for(int i=1; i<=startingNumber; i++) {
			prime = true;
			for(int k=2; k <= i/2; k++) {
				if(i % 2 == 0) {
					prime =false;
				}
			}
			if(prime) {
				max++;
				System.out.println("Result: "+i+" is a prime number");
			} else {
				System.out.println("Result: "+i+" is not a prime number");
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "001011";
		double decimalNumber = convertDecimal(str);
		boolean prime = false;
		System.out.println(decimalNumber);
	
		
		
		//prime number
//		for(int i=2; i<=decimalNumber/2; i++) {
//			if(decimalNumber % i == 0) {
//				prime = true;
//				System.out.println("Not a prime");
//			}
//		}
//		if(!prime) {
//			System.out.println("prime");
//		}
	}
}

//int decimalNumber = Integer.parseInt(str, 2);
//System.out.println(decimalNumber);
//boolean prime = false;
