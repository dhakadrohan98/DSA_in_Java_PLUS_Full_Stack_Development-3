package org.exceptionhandling;

public class NullPointerExceptionMultipleCatchBlock {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		} 
		catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception occurs: "+ ae.getMessage()); 
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
		} 
		catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
		System.out.println("rest of the code"); 
	}
}
