package String;

public class string1 {

	public static void main(String[] args) {
		String str1 = "Hello";
		//str = "Nikal";
		String str2 = "bye";
		
		// chatAt(index);
		for(int i=0; i<str1.length(); i++)
			System.out.println(str1.charAt(i));
		
		// Concatenation
		System.out.println(str1 + str2);
		System.out.println(str2.concat(str1));
		
		// substring methods
		System.out.println(str1.substring(1, 5));
		System.out.println(str1.substring(2));
		
		// indexOf Methods
		System.out.println(str1.indexOf('o'));
		System.out.println(str1.indexOf('l',3) );
		
		// StartsWith
		System.out.println(str1.startsWith("He"));
		System.out.println(str1.startsWith("he"));
	}

}
