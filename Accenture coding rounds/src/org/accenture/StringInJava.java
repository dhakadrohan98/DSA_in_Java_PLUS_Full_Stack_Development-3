package org.accenture;
import java.util.*;

public class StringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Rohan Dhakad";
		String number = "2";
		int five = 5;
		
		System.out.println("Enter a character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
		
		
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		
		char[] arr = str.toCharArray();
		for(char cha:arr) {
			System.out.println(cha);
		}
		
//		int num = Integer.parseInt(number);
		int num = Integer.valueOf(number);
		System.out.println(num+6);
		
		String fi = String.valueOf(five);
		System.out.println(fi+"Hi");
		// method=> Integer.toString(age)

	}

}
