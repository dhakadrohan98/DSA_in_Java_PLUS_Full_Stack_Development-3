package String;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String str = "@ja!*&v*a^sta&%r";
		
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);

	}

}
