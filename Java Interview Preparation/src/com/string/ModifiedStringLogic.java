package com.string;

public class ModifiedStringLogic {

	public static void main(String[] args) {
		// Get the String
        String str = "Geeks Gor Geeks";
  
        // Get the index
        int index = 6;
  
        // Get the character
        char ch = 'z';
  
        // Print the original string
        System.out.println("Original String = " + str);
  
        str = str.substring(0, index) + ch
              + str.substring(index+1);
  
        // Print the modified string
        System.out.println("Modified String = " + str);
        // Concatenation: String+char = String
        System.out.println("Rohan"+'m');

	}

}
