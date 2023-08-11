package String;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
        String str = "  ja v a st a  r  ";
        
        System.out.println(str);
		String plainStr = str.replaceAll("\\s", "");
		System.out.println(plainStr);


	}

}
