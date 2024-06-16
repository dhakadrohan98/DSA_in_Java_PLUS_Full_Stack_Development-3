package org.string;

public class StribgBuilderMethods {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("first");
		sb.append("Second");
		String string = sb.toString();
		System.out.println(string);
		String str1 = "ItisOkay";
		StringBuilder sb1 = new StringBuilder(str1);
		str1 = sb1.reverse().toString();
		System.out.println(str1);
	}
}
