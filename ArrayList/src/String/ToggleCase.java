package String;
import java.io.*;
import java.util.*;

public class ToggleCase {

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

	public static String toggleCase(String str)
	{
		String sn = "";

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			int asc = ch;

			if(asc >= 65 && asc <= 90)
			{
				asc += 32;
				char cht = (char) asc;
				sn += cht;
			}

			else if(asc >= 97 && asc <= 122)
			{
				asc -= 32;
				char cht = (char) asc;
				sn += cht;
			}
		}

		return sn;
	}

}