package String;
import java.util.*;
import java.io.*;

public class stringConversionToLowerCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String sn = "";
		
		 for(int i=0; i<str.length(); i++)
		 {
			char ch = str.charAt(i);
			int asc = ch;
			
			if(asc >= 97 && asc <=122)
			{
				asc -= 32;
				char cht = (char) asc;
				sn += cht;
			}
		}
		
       System.out.println(sn);
	}
}
