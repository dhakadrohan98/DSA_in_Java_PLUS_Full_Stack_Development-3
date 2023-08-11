package String;

public class reverseString {

	public static void main(String[] args) {
		String str = "phone";
		
		System.out.println(reverse(str));

	}
	
	public static String reverse(String str)
	{
		if(str.length() == 0)
			return "0";
		
		else if(str.length() == 1)
			return str;
		
		else
		{
			String rev = "";
			int last = str.length()-1;
			
			for(int i=last; i>=0; i--)
			{
				rev += str.charAt(i);
			}
			
			return rev;
		}
	}

}
