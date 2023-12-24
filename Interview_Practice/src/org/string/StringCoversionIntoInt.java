package org.string;

public class StringCoversionIntoInt {

	public static void main(String[] args) {
		int num = 5;
		String str = Integer.toString(num);
		System.out.println("Integer.toString automatically: "+ str+num);
		int result1 = Integer.parseInt(str+num);
		System.out.println("Integer.parseInt(str+num) "+ result1%4);
		int result2 = Integer.valueOf(str+num);
		System.out.println("Integer.valueOf(str+num) "+ result2%3);
		
		System.out.println("String.valueOf(num) "+ (String.valueOf(num)+'C').toLowerCase());

	}

}
