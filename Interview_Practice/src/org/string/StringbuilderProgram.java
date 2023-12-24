package org.string;

public class StringbuilderProgram {

	public static void main(String[] args) {
		String str = "Rohan Dhakad";
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(1, 'z');
		System.out.println("Original String: "+str);
		System.out.println("Modifiable string: "+sb);
		System.out.println(str.charAt(0));
	}

}
