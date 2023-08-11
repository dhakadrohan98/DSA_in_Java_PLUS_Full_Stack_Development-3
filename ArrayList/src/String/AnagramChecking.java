package String;
import java.util.Scanner;

public class AnagramChecking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(isAnagram(s1,s2));

	}
	
	public static boolean isAnagram(String s1, String s2)
	{
		int count[] = new int[256];
		
		for(int i=0; i < s1.length(); i++)
		{
		    System.out.println(count[s1.charAt(i)]);	
		    count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		for(int i=0; i<count.length; i++)
		{
			if(count[i] != 0)
				return false;
		}
		return true;
	}

}
