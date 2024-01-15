package org.wissen.original_questions;

public class Main
{
	public static void main(String[] args) {
		// Given string str
        String str = "whatIsYourName";
        //what_Is_Your_Name
 
        // Print the modified string
        System.out.print(camelToSnake(str));
        //A-Z = 65 to 90
        //a-z = 97 to 122
        
	}
	
	public static String camelToSnake(String str) {
		System.out.println(Integer.valueOf('a'));
        String result = str;
        String temp="";
        int start=0;
        
        for(int i=0; i<str.length(); i++) {
        	char ch = result.charAt(i);
        	if(Integer.valueOf(ch) >= 65 && Integer.valueOf(ch) <= 90) {
        		temp = temp + str.substring(start,i+1) + "_";
        		start = i-1;
        	} 
        	else if(Integer.valueOf(ch) >= 97 && Integer.valueOf(ch) <= 122) {
        		
        	}
        }
        
 
    
        return str;
    }
}
