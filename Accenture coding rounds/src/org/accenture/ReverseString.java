package org.accenture;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Rohan";
		System.out.println(str.length());
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}

		System.out.println(rev);
	}

}
