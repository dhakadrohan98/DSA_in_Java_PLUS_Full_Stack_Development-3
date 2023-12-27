package org.string;

import java.util.Scanner;

//CoderByte Interview medium level question
public class CoutingOccurenceFormattedOutput {

	public static String challenge(String str) {
		String res = "";
		str = str + "$"; //Adding $ string to end of str
		int count=1;
		for(int i=0, j=i+1; i < str.length()-1 && j < str.length(); i++, j++) {
			if(str.charAt(i) == str.charAt(j)) {
				count++;
			} 
			else {
				res = res + Integer.toString(count) +str.charAt(i);
				count=1;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Length of entered string: "+str.length());
		String res = challenge(str);
		System.out.println(res);
		//Result from challenge  method: 3w2x1y1w
		
		//processing the data: --3------w--2----x--y--w
		try {
			String dashes="";
			String count="";
			String doubleDash = "--";
			int temp;
			String finalRes="--";
			
			for(int i=0; i<res.length(); i=i+2) {
				
				if(i%2 == 0 && res.charAt(i) == '1') {
					finalRes = finalRes + doubleDash + res.charAt(i+1);
				}
				else {
					if(i%2 == 0) {
						count = count + res.charAt(i); 
					}
					temp = Integer.valueOf(count);
					//putting temp number of dashes in between num & character
					for(int j=1; j<=temp; j++) {
						dashes = dashes + "--";
					}
					if( i < res.length()-2 && res.charAt(i+2) == '1') {
						finalRes = finalRes + count + dashes + res.charAt(i+1);
					}
					else if(i == res.length()-2) {
						finalRes = finalRes + count + dashes + res.charAt(i+1);
					} else {
						finalRes = finalRes + count + dashes + res.charAt(i+1) + doubleDash;
					}
					count = "";
					dashes = "";
				}
			}
			
			System.out.println(finalRes);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//		&& res.charAt(i) != '1'
}
