package String;

import java.io.*;
import java.util.*;

public class stringcompression {

   public static String compression1(String str){
		
		HashSet<Character> set = new HashSet<>();
		String sn = "";

		for(int i=0; i<str.length(); i++) 
		{
			set.add(str.charAt(i));
		}

		for(char s: set)
		{
			sn = sn + s;
		}

		return sn;
	}
	
	public static String compression2(String str)
	{
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i<str.length(); i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1 );
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		
		String snw ="";
		
		for(char key: hm.keySet())
		{
			snw = snw + key + hm.get(key);
		}
		
		return snw;
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
