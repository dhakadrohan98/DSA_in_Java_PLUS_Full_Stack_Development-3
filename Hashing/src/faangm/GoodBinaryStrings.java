package faangm;
import java.util.*;
import java.lang.*;
import java.io.*;

public class GoodBinaryStrings {

	public static int solve(String str) {
        int n = str.length();
        
        if(str.charAt(0) != str.charAt(n-1)) {
            return 2;
        }
        else {
            return n-2;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while(tc!=0) {
		    String str = sc.next();
		    int res = solve(str);
		    System.out.println(res);
		    tc--;
		}
	}

}
