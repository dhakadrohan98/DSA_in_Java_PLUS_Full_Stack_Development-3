package org.exceptionhandling;

import java.util.Iterator;

//Multiple catch block with order
//ArithmeticException
//ArrayIndexOutOfBoundsException
//NullPointerException
//Exception
public class MultipleCatchBlock1 {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[5];    
            a[5]=30/0; 
		} 
		//order of catch block is changed
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
		} 
		catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception occurs: "+ ae.getMessage()); 
		}
		catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
		System.out.println("rest of the code"); 
	}
}
