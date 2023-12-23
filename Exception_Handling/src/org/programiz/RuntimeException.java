package org.programiz;

public class RuntimeException {
	
	public static void getArithmeticException(int dividend, int divisor) {
		try {
			System.out.println("Divide: "+ dividend/divisor);
		} catch(Exception e) {
			System.out.println("Arithmetic Exception: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		getArithmeticException(4,0);
		
		String str = null;
		
		try {
			int length = str.length();
		} catch(Exception e) {
			System.out.println("NullPointer Exception: "+e.getMessage());
		}

	}

}
